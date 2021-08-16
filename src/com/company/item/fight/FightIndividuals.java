package com.company.item.fight;

import com.company.item.person.Hero;
import com.company.item.person.Superhuman;
import com.company.item.person.Villain;

public class FightIndividuals extends Fight {

    private final Hero hero;
    private final Villain villain;

    public FightIndividuals(Hero hero, Villain villain) {
        super(hero.getName() + " vs. " + villain.getName());
        this.hero = hero;
        this.villain = villain;

        // Reset Health
        hero.resetHealth();
        villain.resetHealth();

        maxHeroDamage = hero.calculateMaxDamage(villain);
        maxVillainDamage = villain.calculateMaxDamage(hero);
        startFight();
    }

    public FightIndividuals(Hero hero, Villain villain, boolean heroWins) {
        super(hero.getName() + " vs. " + villain.getName());
        this.hero = hero;
        this.villain = villain;

        // Reset Health
        hero.resetHealth();
        villain.resetHealth();

        maxHeroDamage = hero.calculateMaxDamage(villain);
        maxVillainDamage = villain.calculateMaxDamage(hero);

        if (heroWins) {
            maxVillainDamage = 0;
        } else {
            maxHeroDamage = 0;
        }
        startFight();
    }

    private void startFight()  {

        addAndPrint("\nFight!\n");
        addAndPrint(hero.getName() + ": " + hero.oneliner());
        addAndPrint(villain.getName() + ": " + villain.oneliner() + "\n");
        addAndPrint("Battle Log:");

        Superhuman winner = null;

        while(winner == null) {

            winner = getAttackResult(hero, villain, maxHeroDamage);

            if (winner != null) {
                break;
            }

            winner = getAttackResult(villain, hero, maxVillainDamage);
        }

        addAndPrint("Fight Finished\n");
        addAndPrint(winner.getName() + " has Won the Battle!");

        // Transfer fans
        if (winner.equals(hero)) {
            transferFans(hero, villain);
        } else {
            transferFans(villain, hero);
        }
    }

    private Superhuman getAttackResult(Superhuman w1, Superhuman w2, int maxW1Damage)  {

        // Calculate random damage w1 to w2
        int damageToW2 = (int) Math.round( maxW1Damage * Math.random() );

        // Apply damage to health
        if (damageToW2 > 0) {
            w2.health -= damageToW2;
            addAndPrint(String.format("%s Attacks %s and deals %d Damage", w1.getName(), w2.getName(), damageToW2));
        } else {
            addAndPrint(String.format("%s Attacks %s and missed!", w1.getName(), w2.getName()));
        }

        addAndPrint(String.format("%s Has  %d Health %n", w2.getName(), w2.health));

        // Check death
        if (w2.health <= 0) {
            return w1;
        } else {
            return null;
        }
    }
}
