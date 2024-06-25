package com.oxberry.stoof.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Room {//extends Base {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    int roomId;
    String name;
    int width;
    int length;
    int ceilingHeight;
    String floorType;
    String wallColor;
    ZonedDateTime createdTimestamp;
    ZonedDateTime lastUpdatedTimestamp;

}
