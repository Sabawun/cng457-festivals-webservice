package repository;

import entities.event;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface eventRepository extends JpaRepository <event, Integer> {

    <S extends entities.event> S save(S entity);

    <S extends entities.event> List<S> saveAll(Iterable<S> entities);

    Optional<entities.event> findById(Integer id);

    boolean existsById(Integer id);

    List<event> findAll();

    List<event> findAllById(Iterable<Integer> ids);

    long count();

    void deleteById(Integer id);

    void delete(entities.event entity);
    void deleteAll(Iterable<? extends entities.event> entities);

    void deleteAll();

}
