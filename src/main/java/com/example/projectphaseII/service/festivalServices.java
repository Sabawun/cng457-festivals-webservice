package com.example.projectphaseII.service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.projectphaseII.entities.Festival;
import org.springframework.beans.factory.annotation.Qualifier;
import com.example.projectphaseII.repository.festivalRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Qualifier("FestivalImp")
public class festivalServices
{
    @Autowired
    private festivalRepository FSRepository;

    public Festival saveFestival(Festival c){
        return FSRepository.save(c);
    }
    public Festival getFestival(int id)
    {
        return FSRepository.findById(id).orElse(null);
    }
    public List<Festival> getFestivalscityName(String City)
    {
        return FSRepository.findBycityName(City);
    }

    public List<Festival> getAllFestivals()
    {
        return FSRepository.findAll();
    }

    public List<Festival> getFestivalsByfestivalName(String name){
        return FSRepository.getFestivalsbyNameNaming(name);
    }

    public List<Festival> getHighestfestivalRuns(){
        return FSRepository.getHighestRunFestivalsNative();
    }
}
