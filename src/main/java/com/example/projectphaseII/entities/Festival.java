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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "festivalId")

public class Festival{

    @Id
    private int festivalId;
    private String festivalName;
    private String cityName;

    public Festival(int id,String name, String age) {
        super();
        this.festivalId=id;
        this.festivalName = name;
        this.cityName = age;
    }
    @OneToMany (mappedBy = "festival", cascade = CascadeType.ALL)
    private List <festivalRun> festivalRunList;
}

