package entities;

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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "festivalRunId")

public class festivalRun {
    @Id
    private int festivalRunId;
    private String festivalRunDuration;
    private int festivalRunTime;
    private String festivalRunDate;
    private int festivalId;
    @ManyToOne
    Festival festival;

    @OneToMany (mappedBy = "event", cascade = CascadeType.ALL)
    List <event> eventList;

    @ManyToMany (mappedBy = "festivalRuns", cascade = CascadeType.ALL)
    List<organizer> organizers;

}
