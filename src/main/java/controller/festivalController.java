package controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.festivalServices;
import entities.Festival;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class festivalController {
    @Autowired
    private festivalServices festivalController;

    @PostMapping("/addfestival")
    public Festival addFest(@RequestBody Festival fest)
    {
        return festivalController.save(fest);
    }
    @PostMapping("/getfestival/{festivalid}")
    public Festival getFestival(@PathVariable int festivalId)
    {
        return festivalController.getFestival(festivalId);
    }

    @PostMapping("/getallfestivals")
    public List<Festival> getAllFestivals()
    {
        return festivalController.getAllFestivals();
    }

    @PostMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsByCityName(@PathVariable String festivalPlace)
    {
        return festivalController.getFestivalsByCityName(festivalPlace);
    }

}
