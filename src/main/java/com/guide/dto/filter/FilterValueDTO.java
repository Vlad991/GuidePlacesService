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
public class FilterValueDTO {
    @NotNull(message = "Id is required")
    private Long id;

    @NotNull(message = "filter is required")
    private ValueFilterDTO filter;

    @NotNull(message = "Value is required")
    private String value;

//    private List<PlaceValueFilterValue> placeValueFilterValueList;
}
