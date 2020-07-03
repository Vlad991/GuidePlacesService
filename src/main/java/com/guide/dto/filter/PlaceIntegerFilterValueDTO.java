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
public class PlaceIntegerFilterValueDTO extends PlaceFilterValueDTO {
    @NotNull(message = "Int value is required")
    private Integer intValue;
}
