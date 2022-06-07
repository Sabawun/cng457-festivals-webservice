package com.example.projectphaseII.repository;

import com.example.projectphaseII.entities.shows;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface showRepository extends JpaRepository<shows, Integer> {

    List<shows> findByDurationBetween(int hour1, int hour2);
}