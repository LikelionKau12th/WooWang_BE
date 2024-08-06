package chocopie.example.woowangBE.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;


@Data
@Entity
@RequiredArgsConstructor
@Table(name = "member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;

    @Column(nullable = false, length = 50)
    private String memberName;

    @Column(nullable = false, unique = true, length = 50)
    private String memberEmail;

    @Column(nullable = false, length = 100)
    private String accountPw;

    @Lob
    private String aboutMember;

    @OneToMany(mappedBy = "member")
    private List<Course> courses;

    @OneToMany(mappedBy = "member")
    private List<BookmarkList> bookmarkLists;
}
