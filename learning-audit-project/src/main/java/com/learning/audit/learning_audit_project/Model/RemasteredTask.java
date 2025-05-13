package com.learning.audit.learning_audit_project.Model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Audited                            // that's the extra in hibernate-enverse aproach   (if u notice we won't make the auditing entities)
public class RemasteredTask {

   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;
}
