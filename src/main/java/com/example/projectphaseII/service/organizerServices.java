package com.example.projectphaseII.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.organizer;
import org.springframework.stereotype.Service;
import com.example.projectphaseII.repository.organizerRepository;



@Service
public class organizerServices
{
    @Autowired
    private organizerRepository organizer_Repository;

    public organizer saveOrganizer (organizer Organizer)
    {
        return organizer_Repository.save(Organizer);
    }



}