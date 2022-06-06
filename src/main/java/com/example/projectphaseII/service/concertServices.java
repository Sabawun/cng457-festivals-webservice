package com.example.projectphaseII.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.repository.concertRepository;
import org.springframework.stereotype.Service;


@Service
public class concertServices
{
    @Autowired
    private concertRepository concertRepository;

    public concert save (concert Concerts)
    {
        return concertRepository.save(Concerts);
    }



}
