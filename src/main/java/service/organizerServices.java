package service;

import org.springframework.beans.factory.annotation.Autowired;
import entities.organizer;
import org.springframework.stereotype.Service;
import repository.organizerRepository;



@Service
public class organizerServices
{
    @Autowired
    private organizerRepository organizer_Repository;

    public organizer save (organizer organizer)
    {
        return organizer_Repository.save(organizer);
    }



}