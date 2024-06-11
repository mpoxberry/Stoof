package com.oxberry.stoof.model;

import lombok.Data;


@Data
public class Item {

    private int id;
    private String name;
    private String description;
    private int typeId;
    private String dateOfPurchase;
    private double purchaseValue;
    private int locationId;

}
