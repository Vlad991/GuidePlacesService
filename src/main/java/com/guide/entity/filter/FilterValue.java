package com.guide.entity.filter;

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
@Table(name = "filter_value")
public class FilterValue {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "filter_id")
    private ValueFilter filter;

    @Column(name = "value")
    private String value;

    @OneToMany(mappedBy = "filterValue", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<PlaceValueFilterValue> placeValueFilterValueList;
}
