package com.guide.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.guide.dto.address.AddressDTO;
import com.guide.dto.category.CategoryDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceDTO {
    @NotNull(message = "Id is required")
    private Long id;

    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Short description is required")
    private String shortDescription;

    private String description;

    @NotNull(message = "Address is required")
    private AddressDTO address;

//    private List<PlaceFilterValue> placeFilterValueList;

//    private List<PlaceAttributeValue> placeAttributeValueList;

//    private List<CategoryDTO> categoryList;
}
