package com.learnJpa.learn_JPA.Model;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Table(name = "student_table", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"emailId"}),

}

)
public class Student {

//    works for postgres etc dbs (not for mysql)
//    @SequenceGenerator(name="id_gen", sequenceName = "student_id_generator", allocationSize=1, initialValue=10)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator= "id_gen")

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;
    private String firstName;
    private String lastName;
    private String emailId;

    @Embedded
    private Guardian guardian;


}
