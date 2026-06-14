package com.oxberry.stoof.room.model;

import com.oxberry.stoof.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Location extends BaseModel {

    String locationName;
    String description;

}
