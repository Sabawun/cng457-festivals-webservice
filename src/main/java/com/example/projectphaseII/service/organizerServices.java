package com.example.projectphaseII.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.organizer;
import org.springframework.stereotype.Service;
import com.example.projectphaseII.repository.organizerRepository;

import java.util.List;


@Service
public class organizerServices
{
    @Autowired
    private organizerRepository organizer_Repository;

    public List<organizer> findThem (String key)
    {
        return organizer_Repository.findByFirstNameContainsOrLastNameContainsOrPhoneIsOrEmailStartingWith
                (key,key,key,key);
    }
    public organizer saveOrganizer (organizer Organizer)
    {
        return organizer_Repository.save(Organizer);
    }

    public List<organizer> getOrganizersMultiple(){
        return organizer_Repository.getOrganizerbyMultipleRuns();
    }


}