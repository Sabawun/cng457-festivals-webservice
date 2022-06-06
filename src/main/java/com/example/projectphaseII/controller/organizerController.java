package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.organizer;
import com.example.projectphaseII.service.organizerServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class organizerController {
    @Autowired
    private organizerServices organizerService;


    @GetMapping("/organisersearch")
    public List<organizer> findThem(@RequestParam(name = "code") String code)
    {
        return organizerService.findThem(code);
    }
    @PostMapping("/addorganizer")
    public organizer save(@RequestBody organizer Organizer)
    {
        return organizerService.saveOrganizer(Organizer);
    }
}