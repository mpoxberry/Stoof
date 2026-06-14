package com.oxberry.stoof.room.model;

import com.oxberry.stoof.model.BaseModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Building extends BaseModel {

    String buldingName;
    String description;

}
