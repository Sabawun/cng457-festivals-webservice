package com.example.projectphaseII.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Data
@Entity
@NoArgsConstructor
public class concert extends event {

    private String performerName;

    public concert(int duration, String performerName) {
        super(duration);
        this.performerName = performerName;
    }
}
