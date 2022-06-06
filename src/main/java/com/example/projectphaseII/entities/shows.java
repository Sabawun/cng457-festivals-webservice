package com.example.projectphaseII.entities;

import lombok.Data;

import javax.persistence.Entity;

@Data
@Entity
public class shows extends event
{
    private String performers;
}
