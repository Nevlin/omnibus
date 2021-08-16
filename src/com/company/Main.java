package com.company;

import com.company.item.fight.*;
import com.company.item.gadget.*;
import com.company.item.*;
import com.company.item.person.*;
import com.company.print.Print;
import com.company.item.team.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ItemList itemList = new ItemList();
    private static final ArrayList<Hero> heroes = itemList.heroes();
    private static final ArrayList<Villain> villains = itemList.villains();
    private static final ArrayList<Fan> fans = itemList.fans();
    private static final ArrayList<Weapon> weapons = itemList.weapons();
    private static final ArrayList<Vehicle> vehicles = itemList.vehicles();
    private static final ArrayList<Lair> lairs = itemList.lairs();
    private static final ArrayList<Teamheroes> teamheroes = itemList.teamheroes();
    private static final ArrayList<Teamvillains> teamvillains = itemList.teamvillains();
    private static final ArrayList<Fight> fights = itemList.fights();

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        start();
  
    }

    public static void start() {
        System.out.println("  ____  __  ____  _________  __  ______");
        System.out.println(" / __ \\/  |/  / |/ /  _/ _ )/ / / / __/");
        System.out.println("/ /_/ / /|_/ /    // // _  / /_/ /\\ \\  " + "  Group:   07");
        System.out.println("\\____/_/  /_/_/|_/___/____/\\____/___/  " + "  Version: 1.1.0");

        menuMain();
    }

    public static void menuMain() {

        boolean showOptions = true;

        loop : while (true) {

            // Print Menu
            if (showOptions) {
                String[] options = {"Menu People & Teams", "Menu Gadgets", "Menu Fights"};
                Print.menu("Main Menu", options);
                showOptions = false;
            }

            // Ask Player input
            String playerInput = sc.next() + sc.nextLine();

            switch (playerInput) {
                case "0":
                    // Exit App
                    System.out.println("Closing App");
                    break loop;
                case "1":
                    // Menu People & Teams
                    menuPeople();
                    showOptions = true;
                    break;
                case "2":
                    // Menu Gadgets
                    menuGadgets();
                    showOptions = true;
                    break;
                case "3":
                    // Menu Fights
                    menuFight();
                    showOptions = true;
                    break;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuPeople() {

        boolean showOptions = true;

        loop : while (true) {

            // Print Menu
            if (showOptions) {
                String[] options = {"List Heroes", "List Villains", "List Fans", "List Teams", "Search..."};
                Print.menu("Menu People", options);
                showOptions = false;
            }

            // Ask Player input
            String playerInput = sc.next() + sc.nextLine();

            switch (playerInput) {
                case "0":
                    // Back to Main Menu
                    break loop;
                case "1":
                    // List Heroes
                    Print.itemList(heroes);
                    showOptions = true;
                    break;
                case "2":
                    // List Villains
                    Print.itemList(villains);
                    showOptions = true;
                    break;
                case "3":
                    // List Fans
                    Print.itemList(fans);
                    showOptions = true;
                    break;
                case "4":
                    // List Teams
                    Print.itemList(teamheroes);
                    Print.itemList(teamvillains);
                    showOptions = true;
                    break;
                case "5":
                    // Search
                    menuSubSearch("Heroes", "Villains", "Fans", "Teams Heroes", "Teams Villains");
                    showOptions = true;
                    break;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuGadgets() {

        boolean showOptions = true;

        loop : while (true) {

            // Print Menu
            if (showOptions) {
                String[] options = {"List Weapons", "List Vehicles", "List Lairs", "Search..."};
                Print.menu("Menu Gadgets", options);
                showOptions = false;
            }

            // Ask Player input
            String playerInput = sc.next() + sc.nextLine();

            switch (playerInput) {
                case "0":
                    // Back to Main Menu
                    break loop;
                case "1":
                    // List Weapons
                    Print.itemList(weapons);
                    showOptions = true;
                    break;
                case "2":
                    // List Vehicles
                    Print.itemList(vehicles);
                    showOptions = true;
                    break;
                case "3":
                    // List Lairs
                    Print.itemList(lairs);
                    showOptions = true;
                    break;
                case "4":
                    // Search
                    menuSubSearch("Weapons", "Vehicles", "Lairs");
                    showOptions = true;
                    break;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuFight() {

        boolean showOptions = true;

        loop: while (true) {

            // Print Menu
            if (showOptions) {
                String[] options = {"Fights List", "New Fight...", "Search..."};
                Print.menu("Fight", options);
                showOptions = false;
            }

            // Ask Player input
            String playerInput = sc.next() + sc.nextLine();

            switch (playerInput) {
                case "0":
                    // Back to Main Menu
                    break loop;
                case "1":
                    // Fights List
                    Print.itemList(fights);
                    showOptions = true;
                    break;
                case "2":
                    // New Fight...
                    menuNewFight();
                    showOptions = true;
                    break;
                case "3":
                    // Search
                    menuSearch("fights");
                    showOptions = true;
                    break;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuNewFight() {

        boolean showOptions = true;

        loop : while (true) {

            // Print Menu Gadgets
            if (showOptions) {
                String[] options = {"Fight Individuals", "Fight Teams"};
                Print.menu("Select Individuals or Teams", options);
                showOptions = false;
            }

            // Ask Player input
            String playerInput = sc.next() + sc.nextLine();

            switch (playerInput) {
                case "0":
                    // Back to Fight Menu
                    break loop;
                case "1":
                    // Fight individuals
                    menuFightIndividuals();
                    showOptions = true;
                    break;
                case "2":
                    // Fight Teams
                    menuFightTeams();
                    showOptions = true;
                    break;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuFightIndividuals() {

        // Ask for Hero and Villain selection
        Hero hero = (Hero) menuSelectItem(heroes,"Hero");
        Villain villain = (Villain) menuSelectItem(villains,"Villain");

        loop : while (true) {

            // Print Menu
            String[] options = {"Hero", "Villain", "Let's Fight!"};
            Print.menu("Select Winner", options);

            // Ask Player input
            String playerInput = sc.next() + sc.nextLine();

            switch (playerInput) {
                case "0":
                    // Back to New Fight Menu
                    break loop;
                case "1":
                    // Hero winner
                    fights.add( new FightIndividuals(hero, villain, true));
                    break loop;
                case "2":
                    // Villain winner
                    fights.add( new FightIndividuals(hero, villain, false));
                    break loop;
                case "3":
                    // Let's Fight (random)
                    fights.add( new FightIndividuals(hero, villain));
                    break loop;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuFightTeams() {

        // Ask for Team Hero and Team Villain selection
        Teamheroes t1 = (Teamheroes) menuSelectItem(teamheroes,"Hero Team");
        Teamvillains t2 = (Teamvillains) menuSelectItem(teamvillains,"Villain Team");

        loop : while (true) {

            // Print Menu
            String[] options = {"Team Heroes", "Team Villains", "Let's Fight!"};
            Print.menu("Select Winner", options);

            // Ask Player input
            String playerInput = sc.next();

            switch (playerInput) {
                case "0":
                    // Back to Fight Menu
                    break loop;
                case "1":
                    // Team Heroes winner
                    fights.add( new FightTeams(t1, t2, true));
                    break loop;
                case "2":
                    // Team Villains winner
                    fights.add( new FightTeams(t1, t2, false));
                    break loop;
                case "3":
                    // Let's Fight (random)
                    fights.add( new FightTeams(t1, t2));
                    break loop;
                default:
                    // Ask again for input
                    askAgain();
            }
        }
    }

    private static void menuSubSearch(String ... options) {

        boolean showOptions = true;

        while (true) {

            // Print Search Category options
            if (showOptions) {
                Print.menu("Search for", options);
                showOptions = false;
            }

            // Ask player input
            if (sc.hasNextInt()) {

                int playerInput = sc.nextInt();
                sc.nextLine();

                if (playerInput == 0) {

                    // Back
                    break;

                } else if (playerInput > 0 && playerInput <= options.length) {

                    // Execute one of the options
                    menuSearch(options[playerInput-1]);
                    showOptions = true;

                } else {
                    askAgain();
                }
            } else {
                sc.nextLine();
                askAgain();
            }
        }
    }

    private static void menuSearch(String category) {

        // Print Menu Search
        System.out.println("-------------------------------------------------------");
        System.out.println("[Search through " + category + "]");
        System.out.print("Enter an ID or name: ");

        // Ask Player input
        String playerInput = sc.next() + sc.nextLine();
        System.out.println();

        // Search
        switch (category.toLowerCase()) {
            case "heroes":
                findItem(heroes, playerInput);
                break;
            case "villains":
                findItem(villains, playerInput);
                break;
            case "fans":
                findItem(fans, playerInput);
                break;
            case "weapons":
                findItem(weapons, playerInput);
                break;
            case "vehicles":
                findItem(vehicles, playerInput);
                break;
            case "lairs":
                findItem(lairs, playerInput);
                break;
            case "teams heroes":
                findItem(teamheroes, playerInput);
                break;
            case "teams villains":
                findItem(teamvillains, playerInput);
                break;
            case "fights":
                findItem(fights, playerInput);
                break;
        }
    }

    private static Item menuSelectItem(ArrayList<? extends Item> itemsList, String category) {

        Item result = null;

        // Print Menu List
        System.out.println("-------------------------------------------------------");
        System.out.printf("[Select your %s to Fight with]%n", category);

        for (int i = 0; i < itemsList.size(); i++) {
            System.out.printf("  (%d) %s%n", i, itemsList.get(i).getName());
        }

        // Ask player input
        System.out.print("Option: ");

        while (result == null) {

            if (sc.hasNextInt()) {

                int playerInput = sc.nextInt();
                sc.nextLine();

                if (playerInput >= 0 && playerInput < itemsList.size()) {

                    result = itemsList.get(playerInput);

                } else {
                    askAgain();
                }
            } else {
                sc.nextLine();
                askAgain();
            }
        }
        return result;
    }

    private static void findItem(ArrayList<? extends Item> itemsList, String playerInput) {

        boolean searchForId = false;
        boolean result = false;

        if (playerInput.charAt(0) == '#') {
            searchForId = true;
        }

        for (Item item : itemsList) {

            if (searchForId) {
                if (item.getId().equalsIgnoreCase(playerInput)) {
                    item.printContents();
                    result = true;
                    break;
                }
            } else {
                if (item.getName().equalsIgnoreCase(playerInput)) {
                    item.printContents();
                    result = true;
                    break;
                }
            }
        }
        if (!result) {
            System.out.println("No match found for: " + playerInput);
        }
    }

    private static void askAgain() {
        System.out.println("Option not available, please try again.");
        System.out.print("Option: ");
    }
}

