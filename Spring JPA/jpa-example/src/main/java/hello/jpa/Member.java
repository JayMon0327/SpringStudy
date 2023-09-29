package hello.jpa;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name", nullable = false, columnDefinition = "varchar(100) default 'EMPTY'") // 객체는 username을 쓰고싶은데 DB에는 name이야
    private String username;
    private int age;

    @Enumerated(EnumType.STRING) //DB에는 enum 타입이 없기때문에 사용
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) //자바에는 날짜, 시간, 날짜와 시간 타입이 있는데 DB에서는 구분에서 써야함
    private Date createdDate;

    private LocalTime testLocalDate; //연월
    private LocalDateTime testLocalDateTime; //연월일

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob //varchar를 넘어서는 큰 문자열을 사용할 때
    private String description;

    public Member() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public RoleType getRoleType() {
        return roleType;
    }

    public void setRoleType(RoleType roleType) {
        this.roleType = roleType;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
