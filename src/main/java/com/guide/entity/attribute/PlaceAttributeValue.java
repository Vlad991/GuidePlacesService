package com.guide.entity.attribute;

import com.guide.entity.Place;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "place_attribute_value")
public class PlaceAttributeValue {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "place_id")
//    private Place place;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private Attribute attribute;
}
