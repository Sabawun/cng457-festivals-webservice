package com.example.projectphaseII.repository;

import com.example.projectphaseII.entities.concert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface concertRepository extends JpaRepository<concert, Integer> {
    List<concert> findByperformerNameContaining(String key);
}
