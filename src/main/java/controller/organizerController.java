package controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import entities.organizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import service.organizerServices;

@RestController
public class organizerController {
    @Autowired
    private organizerServices organizerService;

    @PostMapping("/addorganizer")
    public organizer addOrganizer(@RequestBody organizer organizer)
    {
        return organizerService.save(organizer);
    }
}