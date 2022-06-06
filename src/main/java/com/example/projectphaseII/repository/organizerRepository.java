package com.example.projectphaseII.repository;

import com.example.projectphaseII.entities.organizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface organizerRepository extends JpaRepository<organizer, Integer> {
    List<organizer> findByFirstNameContainsOrLastNameContainsOrPhoneIsOrEmailStartingWith
            (String key1, String key2, String key3, String key4);

//    @Query("SELECT * FROM Organizer WHERE festivalRuns > 1")
//    List<organizer> getOrganizerwithMultipleRuns();
}