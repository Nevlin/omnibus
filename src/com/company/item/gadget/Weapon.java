package com.company.item.gadget;

import com.company.item.person.Superhuman;

public class Weapon extends Gadget {

    private int powerLevel;
    private static int counter = 0;

    public Weapon(String name, String description, int powerLevel, Superhuman owner ) {
        super(name, description, owner);
        this.powerLevel = powerLevel;
        setId(++counter, "#GW-");
    }

    @Override
    public void printContents() {
        super.printContents();
        System.out.printf(contentsFormat, "Power Level: ", powerLevel);
    }
}

