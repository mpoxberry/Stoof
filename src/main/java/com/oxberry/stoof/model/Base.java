package com.oxberry.stoof.model;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Base {

    private String createUser;
    private ZonedDateTime createdDateTime;
    private String updateUser;
    private ZonedDateTime lastUpdateDateTime;
}
