package service;

import org.springframework.beans.factory.annotation.Autowired;
import entities.concert;
import repository.concertRepository;
import org.springframework.stereotype.Service;


@Service
public class concertServices
{
    @Autowired
    private concertRepository concert_Repository;

    public concert save (concert Concerts)
    {
        return concert_Repository.save(Concerts);
    }



}
