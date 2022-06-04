package controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import service.showServices;
import entities.show;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class showController {
    @Autowired
    private showServices showService;

    @PostMapping("/addshow")
    public show addShow(@RequestBody show show)
    {
        return showService.save(show);
    }
}
