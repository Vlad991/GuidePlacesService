package com.guide.dto.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CityDTO {
    @NotNull(message = "Id is required")
    private Long id;

    @NotNull(message = "Country is required")
    private CountryDTO country;

    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Latitude is required")
    private Float latitude;

    @NotNull(message = "Longitude is required")
    private Float longitude;

//    private List<Street> streetList;
}
