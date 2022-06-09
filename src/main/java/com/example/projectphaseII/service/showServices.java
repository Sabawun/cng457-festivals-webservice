package com.example.projectphaseII.service;

import com.example.projectphaseII.entities.festivalRun;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.shows;
import org.springframework.stereotype.Service;
import com.example.projectphaseII.repository.showRepository;

import java.util.ArrayList;
import java.util.Arrays;
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

    public List<shows> maximumPerformers()
    {
        int performercount = 0;
        List<String> temp = null;
        List<String> performerList, performerList2;
        ArrayList<shows> results = new ArrayList<>();
        List<shows> allshows = show_Repository.findAll();
        for (shows allshow : allshows)
        {
            performerList = Arrays.asList(allshow.getPerformers().split(","));
            if (performerList.size() > performercount)
            {
                performercount = performerList.size();
            }
        }
        for (shows allshow : allshows)
        {
            performerList2 = Arrays.asList(allshow.getPerformers().split(","));
            if(performercount == performerList2.size())
            {
                results.add(allshow);
            }
        }
        return results;
    }

}