package com.oxberry.stoof.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Item {

    @Id
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private int typeId;

    @Column
    private String dateOfPurchase;

    @Column
    private double purchaseValue;

    @Column
    private int locationId;

}
