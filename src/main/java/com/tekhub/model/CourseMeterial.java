package com.tekhub.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(exclude = "Course")
public class CourseMeterial {

    @Id
    @SequenceGenerator(
            name = "course_meterial_sequence",
            sequenceName = "course_meterial_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_meterial_sequence"
    )
    private Long courseMeterialId;
    private String courseUrl;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
                name = "course_id",
                referencedColumnName = "courseId"
            )
    private Course course;
}
