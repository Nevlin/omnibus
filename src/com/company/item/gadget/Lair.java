package com.company.item.gadget;

import com.company.item.person.Superhuman;

public class Lair extends Gadget {

    private String location;
    private static int counter = 0;

    public Lair(String name, String description, String location, Superhuman owner) {
        super(name, description, owner);
        this.location = location;
        setId(++counter, "#GL-");
    }

    @Override
    public void printContents() {
        super.printContents();
        System.out.printf(contentsFormat, "Location: ", location);
    }
}
