package com.guide.converter;

import com.guide.dto.PlaceDTO;
import com.guide.entity.Place;
import org.springframework.stereotype.Component;

@Component
public class PlaceConverter {
    public PlaceDTO convertToDto(Place place) {
//        PlaceDTO placeDTO = new PlaceDTO(
//                place.getId(),
//                place.getName(),
//                place.getShortDescription(),
//                place.getDescription(),
//                addressConverter.convertToDto(place.getAddress())
//        );
//        return placeDTO;
        return null;
    }

    public Place convertToEntity(PlaceDTO placeDTO) {
//        Place place = new Place(
//                placeDTO.getId(),
//                placeDTO.getName(),
//                placeDTO.getShortDescription(),
//                placeDTO.getDescription(),
//                addressConverter.convertToEntity(placeDTO.getAddress())
//        );
//        return place;
        return null;
    }
}
