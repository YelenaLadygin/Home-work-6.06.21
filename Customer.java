package com.example.demo;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
    private String name;
    private String address;

    public Customer() {
        super();
    }

    public Customer(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getAdress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "MyMessage [id=" + id + ", name=" + name + "adress ="+ address + "]";
    }

}
