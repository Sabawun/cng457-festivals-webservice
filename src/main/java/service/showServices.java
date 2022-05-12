package service;

import org.springframework.beans.factory.annotation.Autowired;
import entities.show;
import org.springframework.stereotype.Service;
import repository.showRepository;



@Service
public class showServices
{
    @Autowired
    private showRepository show_Repository;

    public show save (show show)
    {
        return show_Repository.save(show);
    }



}