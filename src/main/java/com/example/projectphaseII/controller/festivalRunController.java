package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.festivalRun;
import com.example.projectphaseII.service.festivalRunServices;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
public class festivalRunController {
    @Autowired
    private festivalRunServices festivalRunService;

    @PostMapping("/addfestivalrun")
    public festivalRun save (@RequestBody festivalRun C)
    {
        return festivalRunService.saveFestivalRun(C);
    }

    @GetMapping("/getfestivalrun/{festivalrunid}")
    public festivalRun getFestival(@PathVariable int festivalrunid)
    {
        return festivalRunService.getFestivalRun(festivalrunid);
    }

    @GetMapping("/getallfestivalruns/{festivalid}")
    public List<festivalRun> getFestivalRunsByFestivalId(@PathVariable int festivalid) {
        return festivalRunService.findByFestivalId(festivalid);
    }
    @GetMapping ("/getshortfestivalrun/{duration}")
    public List<festivalRun> getFestivalShortest(@PathVariable int duration)
    {
        return festivalRunService.getShortestFestivalRun(duration);
    }
}
