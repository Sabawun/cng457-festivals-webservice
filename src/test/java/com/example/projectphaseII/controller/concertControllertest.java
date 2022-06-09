package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.concert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import com.example.projectphaseII.ProjectPhaseIIApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ProjectPhaseIIApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class concertControllertest {

    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port ;

    @Test
    void findConcertByDescription() {
        assertEquals(this.restTemplate.getForObject("http://localhost:8080/concertsbydescription?description=Sabawun",concert[].class).length,1);
    }
    @Test
    void findLongest(){
        assertEquals(this.restTemplate.getForObject("http://localhost:8080/longestconcerts",concert[].class).length,1);
       // assertEquals(this.restTemplate.getForObject("http://localhost:8080/longestconcerts",concert.class).getEventId(),0);
       // assertEquals(this.restTemplate.getForObject("http://localhost:8080/longestconcerts",concert.class).getDescription(),"Concert By Sabawun");
    }

}
