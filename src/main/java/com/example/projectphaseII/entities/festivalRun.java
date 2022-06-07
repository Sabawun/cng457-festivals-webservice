package com.example.projectphaseII.entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "festivalRun")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "festivalRunId")

public class festivalRun {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "frID")
    private int festivalRunId;
    private String festivalRunDuration;
    private int festivalRunTime;
    private String festivalRunDate;
    @ManyToOne (cascade = CascadeType.ALL)
    private Festival festival;

    @OneToMany (mappedBy = "festivalRun", cascade = CascadeType.ALL)
    private List <event> eventList;

    @ManyToMany (mappedBy = "festivalRuns", fetch = FetchType.EAGER)
    private List<organizer> organizers;

}
