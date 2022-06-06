package com.example.projectphaseII.controller;
import com.example.projectphaseII.entities.Festival;
import com.example.projectphaseII.service.festivalServices;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class festivalController {
    @Autowired
    private festivalServices festivalService;

    @GetMapping("/initial")
    public List<Festival> initSome(){
        //Returns hardcoded data, a real world application would return from the database
        List<Festival> personList = new ArrayList<Festival>();
        personList.add(new Festival(1,"Tulip Fest","Morphou"));
        personList.add(new Festival(2,"Lefkosa Fest", "Lefkosa"));
        personList.add(new Festival(3,"WhateverFest", "Girne"));
        return personList;
    }
    @PostMapping("/addfestival")
    public Festival save(@RequestBody Festival c)
    {
        return festivalService.saveFestival(c);
    }
    @GetMapping("/getfestival/{festivalid}")
    public Festival getFestival(@PathVariable int festivalid)
    {
        return festivalService.getFestival(festivalid);
    }

    @GetMapping("/getallfestivals")
    public List<Festival> getAllFestivals()
    {
        return festivalService.getAllFestivals();
    }

    @GetMapping ("/festivalsbyname")
    public List<Festival> festivalByName(@RequestParam(name = "festivalName") String festivalName)
            {
            return festivalService.festivalByName(festivalName);
            }
    @GetMapping("/getfestivalsforacity/{city}")
    public List<Festival> getFestivalsBycityName(@PathVariable String city)
    {
        return festivalService.getFestivalscityName(city);
    }

}
