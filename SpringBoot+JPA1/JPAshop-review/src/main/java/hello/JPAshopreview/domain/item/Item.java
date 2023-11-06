package hello.JPAshopreview.domain.item;

import hello.JPAshopreview.domain.Category;
import hello.JPAshopreview.exception.NotEnoughStockException;
import hello.JPAshopreview.service.ItemUpdateDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "dtype")
public abstract class Item {

    @Id @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;
    private int price;
    private int stockQuantity;

    @ManyToMany(mappedBy = "items")
    private List<Category> categories = new ArrayList<>();


    // == 비즈니스 로직 ==

    /**
     * stock 증가(재고증가)
     * @param quantity
     */
    public void addStock(int quantity) {
        this.stockQuantity += quantity;
    }

    /**
     * stock 감소
     * @param quantity
     */
    public void removeStock(int quantity) {
        int result = this.stockQuantity - quantity;
        if (result < 0) {
            throw new NotEnoughStockException("need more stock");
        }
        this.stockQuantity = result;
    }

    /**
     * 상품 수정
     */
    public void change(ItemUpdateDTO dto) {
        this.name = dto.getName();
        this.price = dto.getPrice();
        this.stockQuantity = dto.getStockQuantity();
    }


}


