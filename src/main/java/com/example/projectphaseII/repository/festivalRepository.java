package com.example.projectphaseII.repository;

import java.util.List;

import com.example.projectphaseII.entities.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface festivalRepository extends JpaRepository<Festival, Integer>
{
    List<Festival> findByfestivalNameContaining(String key);
    @Query("SELECT c FROM Festival c WHERE c.festivalName =:name")
    List<Festival> getFestivalsbyNameNaming(@Param("name") String name);

    List<Festival> findBycityName(String cityName);

    @Query(value = "SELECT * FROM Festival WHERE MAX(array_length(festivalRuns,1))", nativeQuery = true)
    List <Festival> getHighestRunFestivalsNative();
}

