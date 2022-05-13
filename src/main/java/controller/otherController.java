package controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.otherServices;
import entities.others;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class otherController {
    @Autowired
    private otherServices other_Controller;

    @PostMapping("/addotheractivity")
    public others addotheractivity(@RequestBody others other)
    {
        return other_Controller.save(other);
    }
}