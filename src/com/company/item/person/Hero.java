package com.company.item.person;

import com.company.print.Print;
import com.company.item.team.Teamheroes;

import java.util.ArrayList;
import java.util.Collections;

public class Hero extends Superhuman {
    
    private final String realName;
    private Villain archEnemy;
    private final ArrayList<Villain> enemies = new ArrayList<>();
    private final ArrayList<Teamheroes> teams = new ArrayList<>();
    private static int counter = 0;

    public Hero(String name, String location, int powerLevel, String realName) {
        super(name, location, powerLevel);
        this.realName = realName;
        setId(++counter, "#H-");
    }

    public Hero(String name, String location, int powerLevel, String realName, String oneliner) {
        super(name, location, powerLevel);
        this.realName = realName;
        this.oneliner = oneliner;
        setId(++counter, "#H-");
    }

    public int calculateMaxDamage(Villain villain) {
        int maxDamage = calculateDamage();
        if (archEnemy.equals(villain)) {
            maxDamage =+ 50;
        }
        return maxDamage;
    }

    public void setArchEnemy(Villain archEnemy) {
        this.archEnemy = archEnemy;
    }

    public Villain getArchEnemy() {
        return archEnemy;
    }

    public void addEnemies(Villain ... enemies) {
        Collections.addAll(this.enemies, enemies);
    }

    public void addTeams(Teamheroes ... teamheroes) {
        Collections.addAll(this.teams, teamheroes);
    }

    @Override
    public void printContents() {
        super.printContents();

        // Print enemies list
        System.out.println();
        System.out.println("Enemies:");
        for (Villain villain : enemies) {
            System.out.printf(contentsFormat, " ", villain.getName());
        }

        // Print Teams
        System.out.println();
        System.out.println("Teams:");
        Print.itemList(teams);

        System.out.println();
        System.out.printf(contentsFormat, "Archenemy: ", archEnemy.getName());
        System.out.printf(contentsFormat, "Real Name: ", realName);
    }
}