package com.oxberry.stoof.room.model;

import com.oxberry.stoof.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Room extends BaseModel {

    String roomName;
    Double squareFootage;
    Double ceilingHeight;
    int numberOfWindows;
    int buldingId;

}