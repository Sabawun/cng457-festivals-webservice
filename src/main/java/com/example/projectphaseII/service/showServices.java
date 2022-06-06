package com.example.projectphaseII.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.shows;
import org.springframework.stereotype.Service;
import com.example.projectphaseII.repository.showRepository;

import java.util.List;


@Service
public class showServices
{
    @Autowired
    private showRepository show_Repository;

    public shows save (shows show)
    {
        return show_Repository.save(show);
    }

    public List<shows> findByDuration (int hour1, int hour2)
    {
        return show_Repository.findByDurationBetween(hour1,hour2);
    }

}