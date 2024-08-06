package chocopie.example.woowangBE.domain;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "bookmarklist")
public class BookmarkList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Member member;

    @Column(nullable = false)
    private String spotRoadAddress;

    @Column(nullable = false)
    private String landmarkAddress;

    @Column(nullable = false)
    private String landmarkName;
}
