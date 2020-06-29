package com.guide.entity.contact;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class EmailContact extends Contact {
    @Column(name = "email")
    private String email;
}
