package com.example.projectphaseII.repository;

import java.util.List;

import com.example.projectphaseII.entities.Festival;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface festivalRepository extends JpaRepository<Festival, Integer>
{

    List<Festival> findBycityName(String cityName);

}

