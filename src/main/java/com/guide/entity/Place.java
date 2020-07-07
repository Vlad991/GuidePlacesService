package com.guide.entity;

import com.guide.entity.address.Address;
import com.guide.entity.attribute.PlaceAttributeValue;
import com.guide.entity.category.Category;
import com.guide.entity.filter.PlaceFilterValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "place")
public class Place {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "short_description", nullable = false)
    private String shortDescription;

    @Column(name = "description")
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PlaceFilterValue> placeFilterValueList;

    public Place(Long id, String name, String shortDescription, String description, Address address) {
        this.id = id;
        this.name = name;
        this.shortDescription = shortDescription;
        this.description = description;
        this.address = address;
    }

    //    @OneToMany(mappedBy = "place", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private List<PlaceAttributeValue> placeAttributeValueList;

    @ManyToMany(mappedBy = "placeList", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Category> categoryList;
}
