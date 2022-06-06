package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.shows;
import com.example.projectphaseII.service.showServices;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class showController {
    @Autowired
    private showServices showService;

    @PostMapping("/addshow")
    public shows addShow(@RequestBody shows show)
    {
        return showService.save(show);
    }
}
