package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.organizer;
import com.example.projectphaseII.service.organizerServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class organizerController {
    @Autowired
    private organizerServices organizerService;

    @PostMapping("/addorganizer")
    public organizer save(@RequestBody organizer Organizer)
    {
        return organizerService.saveOrganizer(Organizer);
    }
}