package chocopie.example.woowangBE.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    //lombok으로 인해서 얘가 getter, setter 설정 다해줌
    //이제 부를때는 .set + method 이름 넣으면됨

    @Column(unique = true, length = 100)
    private String memberName; //닉네임

    @Column(nullable = false, unique = true, length = 50)
    private Long memberEmail;

    @Column
    private Long accountPw;

}
