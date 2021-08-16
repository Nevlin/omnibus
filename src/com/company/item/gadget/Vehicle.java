package com.company.item.gadget;

import com.company.item.person.Superhuman;

public class Vehicle extends Gadget {

    private int maxSpeed;
    private int capacity;
    private static int counter = 0;

    public Vehicle(String name, String description, int maxSpeed, int capacity, Superhuman owner) {
        super(name, description, owner);
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        setId(++counter, "#GV-");
    }

    @Override
    public void printContents() {
        super.printContents();
        System.out.printf(contentsFormat, "Max Speed: ", maxSpeed);
        System.out.printf(contentsFormat, "Capacity: ", capacity);
    }
}
