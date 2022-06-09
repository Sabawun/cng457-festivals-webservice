package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.shows;
import com.example.projectphaseII.service.showServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class showController {
    @Autowired
    private showServices showService;

    @GetMapping("/showsbyduration")
    public List<shows> findByDurationBetween(@RequestParam(name = "start") int start, @RequestParam(name = "end") int end)
    {
        return showService.findByDuration(start,end);
    }

    @PostMapping("/addshow")
    public shows addShow(@RequestBody shows show)
    {
        return showService.save(show);
    }

    @GetMapping("crowdedshows")
    public List<shows> Crowdedshows ()
    {
        return showService.maximumPerformers();
    }
}
