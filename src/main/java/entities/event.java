package entities;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.ManyToOne;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "eventName")


public class event {
    @Id
    @Column(name = "Id")
    private int festivalId;
    private Date date;
    private String description;
    @ManyToOne
    @JoinColumn(name = "festivalRunId")
    festivalRun festivalRun;

}

