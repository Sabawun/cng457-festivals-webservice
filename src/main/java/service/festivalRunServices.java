package service;


import entities.festivalRun;
import repository.festivalRunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class festivalRunServices {
    @Autowired
    private festivalRunRepository FSR;

    public festivalRun saveFestivalRun (festivalRun C)
    {
        return FSR.save(C);
    }
    public festivalRun getFestivalRun(int id)
    {
        return FSR.findById(id).orElse(null);
    }

    public List<festivalRun> findByFestivalId(int festivalId)
    {
        ArrayList<festivalRun> results = new ArrayList<>();
        List<festivalRun> festivalruns = FSR.findAll();
        for (festivalRun festivalbyId: festivalruns)
        {
            if(festivalbyId.getFestivalId() == festivalId)
            {
                results.add(festivalbyId);
            }
        }
        return results;
    }

    public List<festivalRun> getShortestFestivalRun(int duration)
    {

        ArrayList<festivalRun> results = new ArrayList<>();
        List<festivalRun> festivalruns = FSR.findAll();
        for(festivalRun shortestfestivalruns: festivalruns){
            if(duration > shortestfestivalruns.getFestivalRunTime()){
                results.add(shortestfestivalruns);
            }
        }
        return results;
    }
}
