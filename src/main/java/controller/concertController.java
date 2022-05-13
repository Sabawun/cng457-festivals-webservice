package controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.concertServices;
import entities.concert;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class concertController {
    @Autowired
    private concertServices concert_Controller;

    @PostMapping("/addconcert")
    public concert addConcert(@RequestBody concert concert)
    {
        return concert_Controller.save(concert);
    }
}
