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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "phone")
public class organizer {
    @Id
    private String phone;
    private String email;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(
            name = "festival_runs",
            joinColumns = @JoinColumn(name = "phone"),
            inverseJoinColumns = @JoinColumn(name = "festivalRunId")
    )
    List<festivalRun> festivalRuns;
}
