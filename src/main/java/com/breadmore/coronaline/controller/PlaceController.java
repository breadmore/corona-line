package com.breadmore.coronaline.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class PlaceController {

    @GetMapping("/places")
    public String adminPlaces() {
        return "admin/places";
    }
    @GetMapping("/places/{placeId}")
    public String adminPlaceDetail(@PathVariable Integer placeId) {
        return "admin/places-detail";
    }
    @GetMapping("/events")
    public String adminEvents() {
        return "admin/events";
    }
    @GetMapping("/events/{eventId}")
    public String adminEventDetail(@PathVariable Integer eventId) {
        return "admin/events-detail";
    }

}
