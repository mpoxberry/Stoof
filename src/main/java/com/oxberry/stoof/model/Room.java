package com.oxberry.stoof.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.ZonedDateTime;

@Entity
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
