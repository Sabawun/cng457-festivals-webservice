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
    private TestRestTemplate restTemplate;

    @LocalServerPort
    private int port;
    @Test
    void findConcertByDescription() {
        assertEquals(this.restTemplate.getForObject("https://localhost:" + port + "/concertsbydescription",concert[].class).length,0);
    }
}
