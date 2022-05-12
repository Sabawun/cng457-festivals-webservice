package repository;

import java.util.List;
import java.util.Optional;

import entities.Festival;
import org.springframework.data.jpa.repository.JpaRepository;

public interface festivalRepository extends JpaRepository<Festival, Integer>
{
    List<Festival> findByCityName(String festivalPlace);

}

