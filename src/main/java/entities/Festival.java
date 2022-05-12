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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "festivalId")

public class Festival{
    @Id
    @Column(name = "FestivalId")
    private int festivalId;
    @Column(name = "Festival Name")
    private String festivalName;
    @Column(name = "Festival Place")
    private String festivalPlace;

    @OneToMany (mappedBy = "festivalRun", cascade = CascadeType.ALL)
    List <festivalRun> festivalRunList;
}

