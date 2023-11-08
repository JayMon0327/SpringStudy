package hello.JPAshopreview.service;

import hello.JPAshopreview.domain.Address;
import hello.JPAshopreview.domain.Member;
import hello.JPAshopreview.domain.Order;
import hello.JPAshopreview.domain.OrderStatus;
import hello.JPAshopreview.domain.item.Album;
import hello.JPAshopreview.exception.NotEnoughStockException;
import hello.JPAshopreview.repository.OrderRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class OrderServiceTest {

    @Autowired
    EntityManager em;
    @Autowired
    OrderService orderService;
    @Autowired
    OrderRepository orderRepository;

    @Test
    public void 상품주문() throws Exception{
        //given
        Member member = createMember();
        Album album = createAlbum("서울", 20000, 2);
        int orderCount = 2;

        //when
        Long orderId = orderService.Order(member.getId(), album.getId(), orderCount);

        //then
        Order getOrder = orderRepository.findOne(orderId);
        assertThat(getOrder.getStatus()).isEqualTo(OrderStatus.ORDER);
        assertThat(getOrder.getOrderItems().size()).isEqualTo(1);
        assertThat(getOrder.getTotalPrice()).isEqualTo(20000 * orderCount);
        assertThat(album.getStockQuantity()).isEqualTo(0);

    }

    @Test
    public void 상품주문_재고수량초과() throws Exception{
        //given
        Member member = createMember();
        Album album = createAlbum("서울", 20000, 10);
        int orderCount = 11;

        //then
        assertThatThrownBy(()-> orderService.Order(member.getId(), album.getId(), orderCount))
                .isInstanceOf(NotEnoughStockException.class)
                .hasMessage("재고가 부족합니다.");


    }

    @Test
    public void 주문취소() throws Exception{
        //given
        Member member = createMember();
        Album album = createAlbum("이후성", 25000, 10);
        int orderCount = 2;

        Long orderId = orderService.Order(member.getId(), album.getId(), orderCount);

        //when
        orderService.cancelOrder(orderId);

        //then
        Order getOrder = orderRepository.findOne(orderId);

        assertThat(getOrder.getStatus()).isEqualTo(OrderStatus.CANCEL);
        assertThat(album.getStockQuantity()).isEqualTo(10);

    }

    private Album createAlbum(String name, int price, int quantity) {
        Album album = new Album();
        album.setName(name);
        album.setPrice(price);
        album.setStockQuantity(quantity);
        em.persist(album);
        return album;
    }

    private Member createMember() {
        Member member = new Member();
        member.setName("kim");
        member.setAddress(new Address("서울","강서", "123-403"));
        em.persist(member);
        return member;
    }

}