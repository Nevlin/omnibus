package com.company.item.fight;

import com.company.item.Item;
import com.company.item.person.Fan;
import com.company.item.person.Superhuman;

import java.util.ArrayList;
import java.util.Random;

public abstract class Fight extends Item {

    protected int maxHeroDamage;
    protected int maxVillainDamage;
    private static int counter = 0;

    ArrayList<String> fightLog = new ArrayList<>();

    public Fight(String name) {
        super(name);
        setId(++counter, "#B-");
    }

    protected void addAndPrint(String string) {
        fightLog.add(string);
        System.out.println(string);
    }

    protected void transferFans(Superhuman winner, Superhuman loser) {
        Random random = new Random();
        int numFanTransfers = random.nextInt(loser.getFans().size());

        for (int i = 0; i < numFanTransfers; i++) {
            Fan fan = loser.getFans().get(i);
            if (!fan.getFanOf().contains(winner)) {
                fan.addFanOf(winner);
            }
            if (!winner.getFans().contains(fan)) {
                winner.addFans(fan);
            }
            fan.getFanOf().remove(loser);
            loser.getFans().remove(fan);
        }
        addAndPrint(String.format("%d Fans switched from %s to %s", numFanTransfers, loser.getName(), winner.getName()));
    }

    @Override
    public void printContents() {
        super.printContents();

        // Print fight summery
        for (String line : fightLog) {
            System.out.println(line);
        }
    }
}
