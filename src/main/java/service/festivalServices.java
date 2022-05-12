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
    private festivalRepository f;

    public Festival save (Festival fest)
    {
        return FSRepository.save(fest);
    }

    public Festival getFestival(int id)
    {
        return FSRepository.findById(id).orElse(null);
    }
    public List<Festival> getFestivalsByCityName(String festivalPlace)
    {
        return FSRepository.findByCityName(festivalPlace);
    }
    public List<Festival> getAllFestivals()
    {
        return FSRepository.findAll();
    }
}
