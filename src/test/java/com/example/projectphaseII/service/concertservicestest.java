package com.example.projectphaseII.service;

import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.repository.concertRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class concertservicestest {
    @InjectMocks
    concertServices concertServices;
    @Mock
    concertRepository concertRepository;
    @Test
    void findLongestConcerts() {
        concert c1 = new concert(100,"Sabawun");
        concert c2 = new concert(90,"Ali");
        concert c3 = new concert(1,"Junaid");
        List<concert> concerts = new ArrayList<>();
        concerts.add(c1);
        concerts.add(c2);
        concerts.add(c2);

        when(concertRepository.findAll()).thenReturn(new
                ArrayList(concerts));

        List<concert> concertList = concertServices.findLongestConcerts();
       // Assertions.assertEquals(3,concertList.size());
        Assertions.assertEquals("Sabawun",concertList.get(0).getPerformerName());

    };



}
