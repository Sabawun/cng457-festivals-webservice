package controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import entities.organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.organizerServices;

@RestController
public class organizerController {
    @Autowired
    private organizerServices organizer_Controller;

    @PostMapping("/addshow")
    public organizer addOrganizer(@RequestBody organizer show)
    {
        return organizer_Controller.save(show);
    }
}