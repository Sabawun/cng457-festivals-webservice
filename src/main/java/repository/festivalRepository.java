package repository;

import java.util.List;

import entities.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface festivalRepository extends JpaRepository<Festival, Integer>
{

    public List<Festival> findByCityName(String CityName);

}

