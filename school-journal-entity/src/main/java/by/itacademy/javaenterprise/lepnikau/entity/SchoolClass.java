package by.itacademy.javaenterprise.lepnikau.entity;

import lombok.*;
import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "classes")
public class SchoolClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number")
    private Integer number;

    @Column(name = "character")
    private Character character;

    @Formula(value = "concat(number, character)")
    private String classCode;

    @Override
    public String toString() {
        return "SchoolClass{" +
                "classCode='" + classCode + '\'' +
                '}';
    }
}
