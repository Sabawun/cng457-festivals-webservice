package repository;

import entities.concert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertRepository extends JpaRepository<concert, Integer> {

}
