package com.guide.service.data;

import com.guide.entity.Place;
import com.guide.repository.PlaceRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaceService {
    private PlaceRepository placeRepository;

    public PlaceService(PlaceRepository placeRepository) {
        this.placeRepository = placeRepository;
    }

    public Place findById(Long id) {
        return placeRepository.findById(id).get();
    }
}
