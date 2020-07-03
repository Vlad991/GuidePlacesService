package com.guide.entity.attribute;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlaceStringAttributeValue extends PlaceAttributeValue {
    @Column(name = "str_value")
    private String strValue;
}
