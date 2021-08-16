package com.company.item.team;

import com.company.item.person.Hero;
import com.company.item.person.Villain;
import com.company.print.Print;

import java.util.ArrayList;

public class Teamvillains extends Team {
    private ArrayList<Villain> members;
    private static int counter = 0;

    public Teamvillains(String name, ArrayList<Villain> members) {
        super(name);
        this.members = members;
        setId(++counter, "#TV-");
    }

    public int getMaxDamage(ArrayList<Hero> teamheroes) {
        int totalDamage = 0;

        for (Villain villain : members) {
            if (teamheroes.contains(villain.getArchEnemy())) {
                totalDamage += 50;
            }
            totalDamage += villain.calculateDamage();
            }
        return totalDamage;
    }

    public void calcTotalHealth() {
        int total = 0;
        for(Villain villain : members) {
            total += villain.health;
        }
        totalHealth = total;
    }

    public ArrayList<Villain> getMembers() {
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

