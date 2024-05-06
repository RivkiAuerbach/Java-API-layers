package com.example.webapiweb.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class product {
    @Id
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }
    public product(){

    }
    public product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}
