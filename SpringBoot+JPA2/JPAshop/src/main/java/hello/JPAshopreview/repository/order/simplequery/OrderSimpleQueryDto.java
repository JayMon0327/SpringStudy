package hello.JPAshopreview.repository.order.simplequery;

import hello.JPAshopreview.domain.Address;
import hello.JPAshopreview.domain.OrderStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderSimpleQueryDto {
    private Long orderId;
    private String name;
    private LocalDateTime orderDate;
    private OrderStatus orderStatus;
    private Address address;

    public OrderSimpleQueryDto(Long OrderId, String name, LocalDateTime orderDate, OrderStatus orderStatus, Address address) {
        this.orderId = OrderId;
        this.name = name;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.address = address;
    }
}