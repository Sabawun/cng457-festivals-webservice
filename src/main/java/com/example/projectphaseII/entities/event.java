package com.example.projectphaseII.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.ManyToOne;
import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "eventId")


public class event {
    @Id
    @Column(name = "eventId")
    private int eventId;
    private Date date;
    private int duration;
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    private festivalRun festivalRun;

}

