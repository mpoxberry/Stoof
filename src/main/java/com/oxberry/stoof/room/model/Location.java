package com.oxberry.stoof.room.model;

import com.oxberry.stoof.model.BaseModel;

import lombok.Data;

@Data
public class Location extends BaseModel {

    int buildingId;
    String name;
    String description;

}
