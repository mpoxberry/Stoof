package com.oxberry.stoof.model;

import lombok.Data;

@Data
public class Building {

    private int id;
    private boolean mainBuilding;
    private String name;
    private String description;
    private double width;
    private double length;
    private double height;
}
