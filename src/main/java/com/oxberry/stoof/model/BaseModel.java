package com.oxberry.stoof.model;

import java.time.ZonedDateTime;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class BaseModel {

    int id;
    String createUser;
    ZonedDateTime createTimestamp;
    String lastUpdateUser;
    ZonedDateTime lastUpdateTimestamp;

}
