package controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.concertServices;
import entities.concert;
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
