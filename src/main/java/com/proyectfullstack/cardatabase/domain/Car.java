package com.proyectfullstack.cardatabase.domain;

import lombok.*;

import javax.persistence.*;


@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String brand;
    private String model;
    private String color;
    private String registerNumber;
    @Column(name = "`year`")
    private  int year;
    private int price;

    public Car() {}

    public Car(String brand, String model, String color,
               String registerNumber, int year, int price, Owner owner) {
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owner = owner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    @Getter
    @Setter
    private Owner owner;

}
