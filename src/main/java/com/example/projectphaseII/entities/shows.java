package com.example.projectphaseII.entities;

import lombok.Data;

import javax.persistence.Entity;
import java.util.Date;

@Data
@Entity
public class shows extends event
{
    private String performers;

    public shows() {};

    public shows(int eventId, Date date, int duration, String description, com.example.projectphaseII.entities.festivalRun festivalRun, String performers) {
        super(eventId, date, duration, description, festivalRun);
        this.performers = performers;
    }

    public shows(String performers) {
        this.performers = performers;
    }
}
