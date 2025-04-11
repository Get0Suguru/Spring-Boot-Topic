package com.learnJpa.learn_JPA.Model;


import com.fasterxml.jackson.databind.annotation.JsonAppend;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Data
@AttributeOverrides({
        @AttributeOverride(name="name", column = @Column(name = "guardianName")),
        @AttributeOverride(name="email", column = @Column(name = "guardianEmail")),
        @AttributeOverride(name="mobile", column = @Column(name = "guardianMobile"))

})
public class Guardian {

    private String name;
    private String email;
    private long mobile;
}
