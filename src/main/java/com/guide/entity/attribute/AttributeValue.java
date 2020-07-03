package com.guide.entity.attribute;

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
@Table(name = "attribute_value")
public class AttributeValue {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "attribute_id")
    private ValueAttribute attribute;

    @Column(name = "value")
    private String value;

    @OneToMany(mappedBy = "attributeValue", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PlaceValueAttributeValue> placeValueAttributeValueList;
}
