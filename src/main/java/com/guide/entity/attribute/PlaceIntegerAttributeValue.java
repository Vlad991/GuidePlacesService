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
public class PlaceIntegerAttributeValue extends PlaceAttributeValue {
    @Column(name = "int_value")
    private Integer intValue;
}
