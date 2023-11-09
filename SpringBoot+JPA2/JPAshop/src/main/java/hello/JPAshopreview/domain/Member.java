package hello.JPAshopreview.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter @Getter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String name;

    @Embedded
    private Address address;

    @JsonIgnore //dto 객체로 반환하면 설정할 필요없음. 엔티티를 반환하는 경우에 양방향 무한루프 방지용
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


}
