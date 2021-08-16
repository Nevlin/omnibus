package com.company.item.person;

import com.company.item.gadget.Gadget;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Superhuman extends Person {

    protected String location;
    protected int powerLevel;
    protected ArrayList<Gadget> gadgets = new ArrayList<>();
    protected ArrayList<Fan> fans = new ArrayList<>();
    protected String oneliner = "Power! Unlimited POWER!";
    protected int maxHealth = 300;
    public int health = maxHealth;

    public Superhuman(String name, String location, int powerLevel) {
        super(name);
        this.location = location;
        this.powerLevel = powerLevel;
    }

    public String oneliner() {
        return oneliner;
    }

    public void addGadgets(Gadget ... gadgets) {
        Collections.addAll(this.gadgets, gadgets);
    }

    public ArrayList<Gadget> getGadgets() {
        return gadgets;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void addFans(Fan ... fans) {
        Collections.addAll(this.fans, fans);
    }

    public ArrayList<Fan> getFans() {
        return fans;
    }

    public int calculateDamage() {
        int heroPowerLevel = getPowerLevel();
        int gadgetHero = getGadgets().size() * 10;
        int heroFan = getFans().size() * 5;
        int archEnemyBonus = 0;

        return heroPowerLevel + gadgetHero + heroFan + archEnemyBonus;
    }

    public void resetHealth() {
        health = maxHealth;
    }

    @Override
    public void printContents() {
        super.printContents();

        System.out.printf(contentsFormat, "Location:", location);
        System.out.printf(contentsFormat, "Oneliner:", oneliner);

        // Print fans list
        System.out.println();
        System.out.println("Fans:");
        for (Fan fan : fans) {
            System.out.printf(contentsFormat, " ", fan.getName());
        }

        // Print gadgets list
        System.out.println();
        System.out.println("Gadgets:");
        for (Gadget gadget : gadgets) {
            System.out.printf(contentsFormat, " ", gadget.getName());
        }
    }
}
