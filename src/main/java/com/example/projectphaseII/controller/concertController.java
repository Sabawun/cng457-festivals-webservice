package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.service.concertServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class concertController {
    @Autowired
    private concertServices concertService;

    @GetMapping("/longestconcerts")
    public List<concert> findLongest()
    {
        return concertService.findLongestConcerts();
    }
    @GetMapping("/concertsbydescription")
    public List<concert> findConcertByDescription(@RequestParam(name = "description") String description)
    {
        return concertService.findConcertByDescription(description);
    }
    @PostMapping("/addconcert")
    public concert addConcert(@RequestBody concert Concerts)
    {
        return concertService.save(Concerts);
    }
}
