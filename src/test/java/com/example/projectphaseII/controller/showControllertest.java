package com.example.projectphaseII.controller;

import com.example.projectphaseII.ProjectPhaseIIApplication;
import com.example.projectphaseII.entities.shows;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;


import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ProjectPhaseIIApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class showControllertest {


    @Autowired
    TestRestTemplate restTemplate;

    @LocalServerPort
    int port ;

    @Test
    void findByDurationBetween() {
        assertEquals(this.restTemplate.getForObject("http://localhost:8080/showsbyduration?start=1&end=7", shows[].class).length,4);
    }

}