package chocopie.example.woowangBE.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import chocopie.example.woowangBE.domain.Member;

import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer courseNum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "landmark")
    private LandMark landmarkAddress;

    @ManyToOne
    @JoinColumn(name = "accountId", nullable = false)
    private Member member;

    @ManyToOne
    @JoinColumn(name = "landmarkId", nullable = false)
    private LandMark landMark;

    @Column(nullable = false)
    private String spotRoadAddress;

    @Column(nullable = false)
    private Boolean isBookmarked;
}
