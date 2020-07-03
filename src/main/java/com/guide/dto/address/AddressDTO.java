package com.guide.dto.address;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.guide.dto.PlaceDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {
    @NotNull(message = "Id is required")
    private Long id;

    @NotNull(message = "Place is required")
    private PlaceDTO place;

    @NotNull(message = "Country is required")
    private CountryDTO country;

    @NotNull(message = "City is required")
    private CityDTO city;

    @NotNull(message = "Street is required")
    private StreetDTO street;

    @NotNull(message = "Postcode is required")
    private Integer postcode;

    @NotNull(message = "Latitude is required")
    private Float latitude;

    @NotNull(message = "Longitude is required")
    private Float longitude;
}
