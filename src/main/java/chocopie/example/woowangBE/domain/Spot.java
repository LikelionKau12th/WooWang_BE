package chocopie.example.woowangBE.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "spot")
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String spotRoadAddress;

    @ManyToOne
    @JoinColumn(name = "landmarkAddress", referencedColumnName = "landmarkAddress", insertable = false, updatable = false)
    private LandMark landmark;

    @Column(nullable = false)
    private String landmarkName;

    @Column(nullable = false)
    private Double spotxValue;

    @Column(nullable = false)
    private Double spotyValue;

    @Column(nullable = false)
    private Boolean isBookmarked;
}
