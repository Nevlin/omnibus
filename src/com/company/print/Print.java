package com.company.print;

import com.company.item.Item;

import java.util.ArrayList;

public final class Print {

    private Print() {}

    public static void menu(String menuName, String[] options) {
        System.out.println("-------------------------------------------------------");
        System.out.println("[" + menuName + "]");

        for (int i = 0; i < options.length; i++) {
            System.out.println("  (" + (i + 1) + ") " + options[i]);
        }

        if (menuName.equals("Main Menu")) {
            System.out.println("  (0) Exit");
        } else {
            System.out.println("  (0) Back");
        }

        System.out.print("Option: ");
    }

    public static void itemList(ArrayList<? extends Item> itemList) {

        if (itemList.size() == 0) {
            System.out.println("List is empty.");
        } else {
            for (Item item : itemList){
                System.out.println(item.toString());
            }
        }
    }
}