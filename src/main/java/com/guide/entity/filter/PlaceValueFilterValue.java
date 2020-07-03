package com.guide.entity.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlaceValueFilterValue extends PlaceFilterValue {
    @ManyToOne
    @JoinColumn(name = "filter_value_id")
    private FilterValue filterValue;
}
