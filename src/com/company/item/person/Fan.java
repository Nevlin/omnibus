package com.company.item.person;

import com.company.print.Print;

import java.util.ArrayList;
import java.util.Collections;

public class Fan extends Person {

    private final ArrayList<Superhuman> fanOf = new ArrayList<>();
    private static int counter = 0;

    public Fan(String name) {
        super(name);
        setId(++counter, "#F-");
    }

    public void addFanOf(Superhuman ... superhumens) {
        Collections.addAll(this.fanOf, superhumens);
    }

    public ArrayList<Superhuman> getFanOf() {
        return fanOf;
    }

    @Override
    public void printContents() {
        super.printContents();

        // Print fanOf list
        System.out.println();
        System.out.println("Fan of:");
        Print.itemList(fanOf);
    }
}
