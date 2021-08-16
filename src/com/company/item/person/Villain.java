package com.company.item.person;

import com.company.print.Print;
import com.company.item.team.Teamvillains;

import java.util.ArrayList;
import java.util.Collections;

public class Villain extends Superhuman {

    private String evilPlan;
    private Hero archEnemy;
    private final ArrayList<Hero> enemies = new ArrayList<>();
    private final ArrayList<Teamvillains> teams = new ArrayList<>();
    private static int counter = 0;

    public Villain(String name, String location, int powerLevel, String evilPlan)
    {
        super(name, location, powerLevel);
        this.evilPlan = evilPlan;
        setId(++counter, "#V-");
    }

    public Villain(String name, String location, int powerLevel, String evilPlan, String oneliner)
    {
        super(name, location, powerLevel);
        this.evilPlan = evilPlan;
        this.oneliner = oneliner;
        setId(++counter, "#V-");
    }

    public int calculateMaxDamage(Hero hero) {
        int maxDamage = calculateDamage();
        if (archEnemy.equals(hero)) {
            maxDamage =+ 50;
        }
        return maxDamage;
    }

    public void setArchEnemy(Hero archEnemy) {
        this.archEnemy = archEnemy;
    }

    public Hero getArchEnemy() {
        return archEnemy;
    }

    public void addEnemies(Hero ... enemies) {
        Collections.addAll(this.enemies, enemies);
    }

    public void addTeams(Teamvillains ... teamvillains) {
        Collections.addAll(this.teams, teamvillains);
    }

    @Override
    public void printContents() {
        super.printContents();

        // Print enemies list
        System.out.println();
        System.out.println("Enemies:");
        for (Hero hero : enemies) {
            System.out.printf(contentsFormat, " ", hero.getName());
        }

        // Print Teams
        System.out.println();
        System.out.println("Teams:");
        Print.itemList(teams);

        System.out.println();
        System.out.printf(contentsFormat, "Archenemy: ", archEnemy.getName());
        System.out.printf(contentsFormat, "Evil Plan: ", evilPlan);
    }
}
