package com.guide.entity.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlaceIntegerFilterValue extends PlaceFilterValue {
    @Column(name = "int_value")
    private Integer intValue;
}
