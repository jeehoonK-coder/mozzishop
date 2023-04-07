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

    //==생성 메서드==//
    public static Member createMember(String username, String nickname, String email, String password){
        Member member = new Member();
        member.setUsername(username);
        member.setNickname(nickname);
        member.setEmail(email);
        member.setPassword(password);

        return member;
    }


}
