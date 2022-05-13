package service;
import org.springframework.beans.factory.annotation.Autowired;
import entities.others;
import org.springframework.stereotype.Service;
import repository.otherRepository;

@Service
public class otherServices
{
    @Autowired
    private otherRepository other_Repository;

    public others save (others other)
    {
        return other_Repository.save(other);
    }



}