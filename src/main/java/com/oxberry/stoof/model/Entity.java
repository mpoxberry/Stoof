package com.oxberry.stoof.model;

import lombok.Data;

@Data
public class Entity {

    int id;
    String name;
    String description;
    int typeId;
    String dateOfPurchase;
    double purchaseValue;
    int locationId;

}
