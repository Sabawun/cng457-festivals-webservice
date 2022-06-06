package com.example.projectphaseII.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.shows;
import org.springframework.stereotype.Service;
import com.example.projectphaseII.repository.showRepository;



@Service
public class showServices
{
    @Autowired
    private showRepository show_Repository;

    public shows save (shows show)
    {
        return show_Repository.save(show);
    }



}