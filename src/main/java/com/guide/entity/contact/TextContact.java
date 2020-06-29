package com.guide.entity.contact;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TextContact extends Contact {
    @Column(name = "text")
    private String text;
}
