package cz.lukzon.studentRestApi.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Table
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @ManyToOne
    private Classroom classroom;

    private String firstname;

    private String surname;

    private String email;

    private LocalDate boarding;

    private Integer age;

    public Student(Classroom classroom, String firstname, String surname, String email, LocalDate boarding, Integer age) {
        this.classroom = classroom;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.boarding = boarding;
        this.age = age;
    }
}
