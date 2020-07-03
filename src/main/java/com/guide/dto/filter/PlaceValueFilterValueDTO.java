package com.guide.dto.filter;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlaceValueFilterValueDTO extends PlaceFilterValueDTO {
    @NotNull(message = "Filter value is required")
    private FilterValueDTO filterValue;
}
