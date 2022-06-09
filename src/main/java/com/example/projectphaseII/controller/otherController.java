package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.others;
import com.example.projectphaseII.service.otherServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class otherController {
    @Autowired
    private otherServices otherService;

    @PostMapping("/addotheractivity")
    public others addOtherActivity(@RequestBody others other)
    {
        return otherService.save(other);
    }
}