package com.guide.controller;

import com.guide.dto.PlaceDTO;
import com.guide.service.PlaceControllerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
public class PlaceController {
    private PlaceControllerService placeControllerService;

    public PlaceController(PlaceControllerService placeControllerService) {
        this.placeControllerService = placeControllerService;
    }

    @GetMapping("{id}")
    public PlaceDTO place(@PathVariable Long id) {
        return placeControllerService.findById(id);
    }
}
