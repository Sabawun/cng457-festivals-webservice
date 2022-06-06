package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.service.concertServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class concertController {
    @Autowired
    private concertServices concertService;

    @PostMapping("/addconcert")
    public concert addConcert(@RequestBody concert Concerts)
    {
        return concertService.save(Concerts);
    }
}
