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
public class StreetDTO {
    @NotNull(message = "Id is required")
    private Long id;

    @NotNull(message = "City is required")
    private CityDTO city;

    @NotNull(message = "Name is required")
    private String name;

    @NotNull(message = "Latitude is required")
    private Float latitude;

    @NotNull(message = "Longitude is required")
    private Float longitude;
}
