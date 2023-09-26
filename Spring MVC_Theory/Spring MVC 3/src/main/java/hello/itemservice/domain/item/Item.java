package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data //dto는 @Data를 쓰셔도 괜찮은데 일반적으로 @Data는 위험하다. getter setter만 쓰는것이 좋음
public class Item {

    private Long id;
    private String itemName;
    private Integer price; // Integer - null인 가능성이 있다. 0이라도 들어가야한다.
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
