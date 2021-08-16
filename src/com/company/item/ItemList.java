package com.company.item;

import com.company.item.gadget.*;
import com.company.item.person.*;
import com.company.item.team.*;
import com.company.item.fight.Fight;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemList {

    private final ArrayList<Hero> heroes;
    private final ArrayList<Villain> villains;
    private final ArrayList<Fan> fans;
    private final ArrayList<Weapon> weapons;
    private final ArrayList<Vehicle> vehicles;
    private final ArrayList<Lair> lairs;
    private final ArrayList<Teamheroes> teamheroes;
    private final ArrayList<Teamvillains> teamvillains;
    private final ArrayList<Fight> fights;

    public ItemList() {
        // Create Hero list
        heroes = new ArrayList<>(Arrays.asList(
                new Hero("Batman", "Gotham City", 20,  "Bruce Wayne", "The bat is here!!"),
                new Hero("Superman", "Metropolis", 25, "Clark Kent", "This should be easy"),
                new Hero("Wonder Woman", "Themyscira", 18, "Princess Diana"),
                new Hero("Spiderman", "New York", 14, "Peter Parker", "With great power, comes great responsibility"),
                new Hero("Deadpool", "Vancouver", 19, "Wade Wilson"),
                new Hero("Black panther", "Wakanda", 15, "T'Challa"),
                new Hero("Rocket", "Halfworld", 21, "Rocky Raccoon"),
                new Hero("Wolverine", "Alberta", 17, "James Howlett", "Meet my claws!"),
                new Hero("Iron man", "Long Island", 23, "Tony Stark"),
                new Hero("Thor", "Asgardian", 25, "Thor Borson", "Thunder Thor is here")
        ));

        // Create Villain list
        villains = new ArrayList<>(Arrays.asList(
                new Villain("Joker", "Gotham City", 19, "Selling Smylex", "If you're good at something, never do it for free"),
                new Villain("Mr. Freeze", "Gotham City", 9, "destroy everything Batman loves"),
                new Villain("Thanos", "Saturn's moon", 30, "killing half of the people in the universe"),
                new Villain("General Zod", "Krypton", 21, "create new Krypton instead of destroying another planet", "For krypton!"),
                new Villain("Sheev Palpatine", "Galatic Empire", 35, "New evil Empire"),
                new Villain("Loki Laufeyson", "Asgardian", 19, "take over the planet"),
                new Villain("Ulton", "Earth", 28, "destroy the world"),
                new Villain("Ronan the Accuser", "Kree", 19, "rebuild Hala and bring a new dawn to the Kree Empire", "I blame all of you!"),
                new Villain("Francis Freeman", "Vancouver", 13, "make superslaves of people who have no future  and sell them", "You will all be slaves!")
        ));

        // Create Fan list
        fans = new ArrayList<>(Arrays.asList(
                new Fan("Kiana Beltran"),
                new Fan("Alexandra Sandoval"),
                new Fan("Deborah Small"),
                new Fan("Jago Riley"),
                new Fan("Hasan Huynh"),
                new Fan("Johanna Keenan"),
                new Fan("Noah Little"),
                new Fan("Kaine Jacobson")
        ));

        // Create Weapon list
        weapons = new ArrayList<>(Arrays.asList(
                new Weapon("glock","semi automatic pistol", 25, heroes.get(6)),
                new Weapon("rocket propelled grenade", "click, BOOM", 75, villains.get(0)),
                new Weapon("army knife", "military army knife", 15, villains.get(2)),
                new Weapon("laser3000", "gun that shoots laser beams", 90, villains.get(8)),
                new Weapon("batarang", "batman's boomerang", 20, heroes.get(0)),
                new Weapon("mjölnir", "thor's mighty hammer", 135, heroes.get(9)),
                new Weapon("shrink gun", "makes the target tiny", 20, villains.get(5)),
                new Weapon("hand grenade", "military hand grenade", 30, villains.get(3)),
                new Weapon("holy sword", "sword that holds holy powers", 75, villains.get(4)),
                new Weapon("flashbang", "grenade that blinds the opponent", 20, villains.get(6)),
                new Weapon("iron man's suit", "the incredible suit of iron man", 120, heroes.get(8)),
                new Weapon("wolverine's claws", "the sharp claws of wolverine", 100, heroes.get(7)),
                new Weapon("spiderman's web shooters", "device that shoots webs", 95, heroes.get(3)),
                new Weapon("The Lasso of Truth", "wonder woman's lasso of truth", 60, heroes.get(2)),
                new Weapon("unholy sword", "sword that hold unholy power", 70, villains.get(7)),
                new Weapon("freeze gun", "freezes the opponent", 25, villains.get(1)),
                new Weapon("stun grenade", "grenade that stuns the opponent", 25, heroes.get(4)),
                new Weapon("staff of wisdom", "staff that holds magical powers", 95, heroes.get(5)),
                new Weapon("grenade launcher", "gun that fires grenades", 80, heroes.get(1))
        ));

        // Create Vehicle list
        vehicles = new ArrayList<>(Arrays.asList(
                new Vehicle("batmobile", "batman's supercar", 210, 1, heroes.get(0)),
                new Vehicle("gpr1000", "fast motorbike", 265, 2, villains.get(0)),
                new Vehicle("cessna", "small aircraft", 480, 4, villains.get(1)),
                new Vehicle("nimbus3000", "harry potter's magic broom", 185, 1, heroes.get(9)),
                new Vehicle("jeep4x4", "4 wheel drive jeep", 185, 4, villains.get(3)),
                new Vehicle("yamaha raptor", "4 wheel drive atv", 80, 2, heroes.get(5))
        ));

        // Create Lair list
        lairs = new ArrayList<>(Arrays.asList(
                new Lair("batcave", "batman's hideout", "gotham", heroes.get(0)),
                new Lair("underground bunker", "a bunker hidden underground", "underneath the surface", villains.get(0)),
                new Lair("underwater base", "a well designed underwater base", "in the sea", heroes.get(1)),
                new Lair("vulcano base", "this lair is established on top of a non active vulcano", "on top of a vulcano", villains.get(1)),
                new Lair("jungle base", "a base well hidden in the jungle", "deep inside the jungle", heroes.get(2)),
                new Lair("desert base", "a base buried deep in the desert", "egypt", villains.get(2)),
                new Lair("sewer hideout", "this base is established in the sewers", "underneath the city", heroes.get(3))
        ));

        // Create list of a Hero team
        teamheroes = new ArrayList<>(Arrays.asList(
                new Teamheroes("Superbat", new ArrayList<>(Arrays.asList(heroes.get(0), heroes.get(1)))),
                new Teamheroes("Wonderspider", new ArrayList<>(Arrays.asList(heroes.get(2), heroes.get(3)))),
                new Teamheroes("Blackpool", new ArrayList<>(Arrays.asList(heroes.get(4), heroes.get(5)))),
                new Teamheroes("Wolverocket", new ArrayList<>(Arrays.asList(heroes.get(6), heroes.get(7)))),
                new Teamheroes("Ironthor", new ArrayList<>(Arrays.asList(heroes.get(8), heroes.get(9))))
        ));

        // Create list of a Villain team
        teamvillains = new ArrayList<>(Arrays.asList(
                new Teamvillains("Freezing joker", new ArrayList<>(Arrays.asList(villains.get(0), villains.get(1)))),
                new Teamvillains("General thanos", new ArrayList<>(Arrays.asList(villains.get(2), villains.get(3)))),
                new Teamvillains("Loki palpatine", new ArrayList<>(Arrays.asList(villains.get(4), villains.get(5)))),
                new Teamvillains("Accuser ulton", new ArrayList<>(Arrays.asList(villains.get(6),villains.get(7))))
        ));

        // Create list of Fights
        fights = new ArrayList<>();

        // Add archenemy to Hero
        int[] villainArchIndexList = {0,1,3,2,8,7,4,7,6,5};
        for (int i = 0; i < heroes.size(); i++) {
            heroes.get(i).setArchEnemy(villains.get(villainArchIndexList[i]));
        }

        // Add archenemies to Villain
        int[] heroArchIndexList = {0,1,3,2,6,9,8,5,4};
        for (int i = 0; i < villains.size(); i++) {
            villains.get(i).setArchEnemy(heroes.get(heroArchIndexList[i]));
        }

        // Add enemies to Hero
        heroes.get(0).addEnemies(villains.get(0), villains.get(1), villains.get(3));
        heroes.get(1).addEnemies(villains.get(0), villains.get(1), villains.get(3));
        heroes.get(2).addEnemies(villains.get(1), villains.get(3));
        heroes.get(3).addEnemies(villains.get(2), villains.get(6));
        heroes.get(4).addEnemies(villains.get(8), villains.get(2));
        heroes.get(5).addEnemies(villains.get(2), villains.get(6), villains.get(3));
        heroes.get(6).addEnemies(villains.get(4), villains.get(2), villains.get(7),villains.get(6));
        heroes.get(7).addEnemies(villains.get(7), villains.get(8));
        heroes.get(8).addEnemies(villains.get(2), villains.get(5), villains.get(6), villains.get(7));
        heroes.get(9).addEnemies(villains.get(7), villains.get(5), villains.get(6));

        // Add enemy to Villain
        villains.get(0).addEnemies(heroes.get(0), heroes.get(1), heroes.get(2));
        villains.get(1).addEnemies(heroes.get(1), heroes.get(0));
        villains.get(2).addEnemies(heroes.get(3), heroes.get(4), heroes.get(5), heroes.get(6), heroes.get(9), heroes.get(8));
        villains.get(3).addEnemies(heroes.get(0), heroes.get(2), heroes.get(1));
        villains.get(4).addEnemies(heroes.get(1), heroes.get(6), heroes.get(9));
        villains.get(5).addEnemies(heroes.get(9), heroes.get(6));
        villains.get(6).addEnemies(heroes.get(8), heroes.get(6), heroes.get(9));
        villains.get(7).addEnemies(heroes.get(4), heroes.get(9), heroes.get(6));
        villains.get(8).addEnemies(heroes.get(4), heroes.get(7));

        // Add Heroes and Villains to Fan
        fans.get(0).addFanOf(heroes.get(0),villains.get(0), heroes.get(1), heroes.get(2), heroes.get(3));
        fans.get(1).addFanOf(villains.get(0), villains.get(1), villains.get(3), villains.get(7));
        fans.get(2).addFanOf(heroes.get(2), heroes.get(4), heroes.get(6), heroes.get(9), villains.get(4));
        fans.get(3).addFanOf(heroes.get(8), heroes.get(9), heroes.get(4), villains.get(0), villains.get(5), heroes.get(6));
        fans.get(4).addFanOf(heroes.get(7),heroes.get(1), villains.get(2), villains.get(6), villains.get(8));
        fans.get(5).addFanOf(villains.get(3), villains.get(7), heroes.get(7), heroes.get(0), heroes.get(5));
        fans.get(6).addFanOf(heroes.get(2), heroes.get(3), villains.get(1), villains.get(2));
        fans.get(7).addFanOf(villains.get(3), villains.get(5), heroes.get(6), heroes.get(7), heroes.get(8), villains.get(8));

        // Add fans to Hero and Villain
        for (Fan fan : fans) {
            for (Superhuman superhuman : fan.getFanOf()) {
                superhuman.addFans(fan);
            }
        }

        // Add gadgets to Hero and Villain
        for (Weapon weapon : weapons) {
            weapon.getOwner().addGadgets(weapon);
        }
        for (Vehicle vehicle : vehicles) {
            vehicle.getOwner().addGadgets(vehicle);
        }
        for (Lair lair : lairs) {
            lair.getOwner().addGadgets(lair);
        }

        // Add Team to Hero And Villain
        for (Teamheroes team : teamheroes) {
            for (Hero hero : team.getMembers()) {
                hero.addTeams(team);
            }
        }
        for (Teamvillains team : teamvillains) {
            for (Villain villain : team.getMembers()) {
                villain.addTeams(team);
            }
        }
    }

    public ArrayList<Hero> heroes() {
        return heroes;
    }
    public ArrayList<Villain> villains() {
        return villains;
    }
    public ArrayList<Fan> fans() {
        return fans;
    }
    public ArrayList<Weapon> weapons() {
        return weapons;
    }
    public ArrayList<Vehicle> vehicles() {
        return vehicles;
    }
    public ArrayList<Lair> lairs() {
        return lairs;
    }
    public ArrayList<Teamheroes> teamheroes() {
        return teamheroes;
    }
    public ArrayList<Teamvillains> teamvillains() {
        return teamvillains;
    }
    public ArrayList<Fight> fights() {
        return fights;
    }

}
