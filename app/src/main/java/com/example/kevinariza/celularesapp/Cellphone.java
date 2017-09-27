package com.example.kevinariza.celularesapp;

/**
 * Created by Kevin Ariza on 26/09/2017.
 */

public class Cellphone {
    private String trademark;
    private int capacity ;
    private String color;
    private String os;
    private double price;

    public Cellphone(String trademark, int capacity, String color, String os, double price) {
        this.trademark = trademark;
        this.capacity = capacity;
        this.color = color;
        this.os = os;
        this.price = price;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void guardar(){
        Data.guardar(this);
    }
}
