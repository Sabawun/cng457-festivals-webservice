package controller;
import entities.festivalRun;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import service.festivalRunServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class festivalRunController {
    @Autowired
    private festivalRunServices festivalRunService;

    @PostMapping
    public festivalRun save (festivalRun C)
    {
        return festivalRunService.saveFestivalRun(C);
    }

    @GetMapping("/getfestivalrun/{festivalrunid}")
    public festivalRun getFestival(@PathVariable int festivalrunId)
    {
        return festivalRunService.getFestivalRun(festivalrunId);
    }

    @GetMapping("/getallfestivalruns/{festivalid}")
    public List<festivalRun> getFestivalRunsByFestivalId(@PathVariable int festivalId) {
        return festivalRunService.findByFestivalId(festivalId);
    }
    @GetMapping ("/getshortfestivalrun/{duration}")
    public List<festivalRun> getFestivalShortest(@PathVariable int duration)
    {
        return festivalRunService.getShortestFestivalRun(duration);
    }
}
