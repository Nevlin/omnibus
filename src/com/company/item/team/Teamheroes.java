package com.company.item.team;

import com.company.item.person.Hero;
import com.company.item.person.Villain;
import com.company.print.Print;

import java.util.ArrayList;

public class Teamheroes extends Team {
    private final ArrayList<Hero> members;
    private static int counter = 0;

    public Teamheroes(String name, ArrayList<Hero> members) {
        super(name);
        this.members = members;
        setId(++counter, "#TH-");
        calcTotalHealth();
    }

    public int getMaxDamage(ArrayList<Villain> teamvillains) {
        int totalDamage = 0;

        for (Hero hero : members) {
            if (teamvillains.contains(hero.getArchEnemy())) {
                totalDamage += 50;
            }
            totalDamage += hero.calculateDamage();
        }
        return totalDamage;
    }

    public void calcTotalHealth() {
        int total = 0;
        for(Hero hero : members) {
            total += hero.health;
        }
        totalHealth = total;
    }

    public ArrayList<Hero> getMembers() {
        return members;
    }

    @Override
    public void printContents() {
        super.printContents();

        // Print members
        System.out.println();
        System.out.println("Members:");
        Print.itemList(members);
    }
}
