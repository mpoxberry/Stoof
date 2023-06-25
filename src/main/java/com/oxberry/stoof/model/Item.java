package com.oxberry.stoof.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
@Data
public class Item {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "ITEM_ID")
    private int id;

    @Column( name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "TYPE_ID")
    private int typeId;

    @Column(name = "DATE_OF_PURCHASE")
    private String dateOfPurchase;

    @Column(name = "PURCHASE_VALUE")
    private double purchaseValue;

    @Column(name = "LOCATION_ID")
    private int locationId;

}
