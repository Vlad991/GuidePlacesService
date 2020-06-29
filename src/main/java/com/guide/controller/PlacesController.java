package com.guide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/place")
public class PlacesController {
    @GetMapping("{id}")
    public Long place(@PathVariable Long id) {
        return id;
    }
}
