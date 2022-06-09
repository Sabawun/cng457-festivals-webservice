package com.example.projectphaseII.service;

import com.example.projectphaseII.entities.concert;
import com.example.projectphaseII.entities.shows;
import com.example.projectphaseII.repository.concertRepository;
import com.example.projectphaseII.repository.showRepository;
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
public class showservicestest {

    @InjectMocks
    showServices showService;
    @Mock
    showRepository showRepository;
    @Test
    void maximumPerformers(){
        shows s1 = new shows("Sabawun,Onur");
        shows s2 = new shows("Onur,Abdullah,Sabawun");
        shows s3 = new shows("Abdullah");
        List<shows> array_show = new ArrayList<>();
        array_show.add(s1);
        array_show.add(s2);
        array_show.add(s3);

        when(showRepository.findAll()).thenReturn(new
                ArrayList(array_show));

        List<shows> showList = showService.maximumPerformers();
        //Assertions.assertEquals(array_show.size()-1,showList.size());
        Assertions.assertEquals("Onur,Abdullah,Sabawun",showList.get(0).getPerformers());
    }
}

