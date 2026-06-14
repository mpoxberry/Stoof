package com.oxberry.stoof.model;

import java.time.ZonedDateTime;

import lombok.Data;

@Data
public class BaseModel {

    int id;
    String createUser;
    ZonedDateTime createTimestamp;
    String lastUpdateUser;
    ZonedDateTime lastUpdateTimestamp;

}
