package com.guide.service;

import com.guide.converter.PlaceConverter;
import com.guide.dto.PlaceDTO;
import com.guide.service.data.PlaceService;
import org.springframework.stereotype.Service;

@Service
public class PlaceControllerService {
    private PlaceService placeService;
    private PlaceConverter placeConverter;

    public PlaceControllerService(PlaceService placeService, PlaceConverter placeConverter) {
        this.placeService = placeService;
        this.placeConverter = placeConverter;
    }

    public PlaceDTO findById(Long id) {
        return placeConverter.convertToDto(placeService.findById(id));
    }
}
