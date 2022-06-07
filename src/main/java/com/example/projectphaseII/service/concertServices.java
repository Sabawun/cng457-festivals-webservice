package com.example.projectphaseII.service;

import com.example.projectphaseII.entities.festivalRun;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.repository.concertRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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

    public List<concert> findLongestConcerts()
    {
        int longest = 0;
        ArrayList<concert> results = new ArrayList<>();
        List<concert> concerts = concertRepository.findAll();
        for (concert duration: concerts)
        {
            if(duration.getDuration() > longest)
            {
                longest = duration.getDuration();
            }
        }
        for(concert duration: concerts){
            if(longest == duration.getDuration()){
                results.add(duration);
            }
        }
        return results;
    }


}
