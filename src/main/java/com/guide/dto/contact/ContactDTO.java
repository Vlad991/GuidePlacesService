package com.guide.dto.contact;

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
public class ContactDTO {
    @NotNull(message = "Id is required")
    private Long id;

    @NotNull(message = "Place is required")
    private PlaceDTO place;

    @NotNull(message = "Name is required")
    private String name;
}
