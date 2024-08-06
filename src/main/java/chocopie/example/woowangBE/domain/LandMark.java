package chocopie.example.woowangBE.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@RequiredArgsConstructor
@Table(name = "landmark")
public class LandMark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String landmarkAddress;

    @Column(nullable = false)
    private String landmarkName;

    @Column(nullable = false)
    private String hashTag;

    @OneToMany(mappedBy = "course")
    private List<Course> courses = new ArrayList<>();

    @OneToMany(mappedBy = "landmark")
    private List<Spot> spots = new ArrayList<>();
}
