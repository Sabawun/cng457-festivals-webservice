package com.example.projectphaseII.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.repository.concertRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class concertServices
{
    @Autowired
    private concertRepository concertRepository;

    public List<concert> findConcertByDescription (String key) {
        return concertRepository.findByperformerNameContaining(key);}
    public concert save (concert Concerts)
    {
        return concertRepository.save(Concerts);
    }



}
