package controller;
import org.springframework.web.bind.annotation.*;
import service.festivalServices;
import entities.Festival;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class festivalController {
    @Autowired
    private festivalServices festivalService;

    @PostMapping("/addfestival")
    public Festival save(@RequestBody Festival c)
    {
        return festivalService.saveFestival(c);
    }
    @GetMapping("/getfestival/{festivalid}")
    public Festival getFestival(@PathVariable int festivalId)
    {
        return festivalService.getFestival(festivalId);
    }

    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestivals()
    {
        return festivalService.getAllFestivals();
    }

    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsByCityName(@PathVariable String city)
    {
        return festivalService.getFestivalsCityName(city);
    }

}
