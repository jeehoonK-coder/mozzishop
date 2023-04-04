package mozzibook.mozzishop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String username;

    private String email;
    private String password;
    private String nickname;

    @Embedded
    private Address address;

    //orders
    @OneToMany(mappedBy = "member")
    private List<Order> orders = new ArrayList<>();


}
