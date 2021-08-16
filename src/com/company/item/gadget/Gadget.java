package com.company.item.gadget;

import com.company.item.Item;
import com.company.item.person.Superhuman;

public abstract class Gadget extends Item {

    protected String description;
    protected Superhuman owner;

    public Gadget(String name, String description, Superhuman owner) {
        super(name);
        this.description = description;
        this.owner = owner;
    }

    public Superhuman getOwner() {
        return owner;
    }

    @Override
    public void printContents() {
        super.printContents();

        System.out.printf(contentsFormat, "Description: ", description);
        System.out.printf(contentsFormat, "Owner: ", owner.getName());
    }

}



