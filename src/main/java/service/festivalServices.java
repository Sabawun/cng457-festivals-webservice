package service;
import org.springframework.beans.factory.annotation.Autowired;
import entities.Festival;
import repository.festivalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
    public List<Festival> getFestivalsCityName(String City)
    {
        return FSRepository.findByCityName(City);
    }
    public List<Festival> getAllFestivals()
    {
        return FSRepository.findAll();
    }
}
