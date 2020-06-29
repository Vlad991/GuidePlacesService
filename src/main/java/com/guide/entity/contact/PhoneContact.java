package com.guide.entity.contact;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PhoneContact extends Contact {
    @Column(name = "phone")
    private String phone;
}
