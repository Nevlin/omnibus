package com.company.item.fight;

import com.company.item.team.*;

public class FightTeams extends Fight {

    private final Teamheroes teamheroes;
    private final Teamvillains teamVillains;

    public FightTeams(Teamheroes teamheroes, Teamvillains teamVillains) {
        super(teamheroes.getName() + " vs. " + teamVillains.getName());
        this.teamheroes = teamheroes;
        this.teamVillains = teamVillains;
        this.maxHeroDamage = teamheroes.getMaxDamage(teamVillains.getMembers());
        this.maxVillainDamage = teamVillains.getMaxDamage(teamheroes.getMembers());

        // Reset Health
        teamheroes.calcTotalHealth();
        teamVillains.calcTotalHealth();

        startFight();
    }

    public FightTeams(Teamheroes teamheroes, Teamvillains teamVillains, boolean heroTeamWins) {
        super(teamheroes.getName() + " vs. " + teamVillains.getName());
        this.teamheroes = teamheroes;
        this.teamVillains = teamVillains;
        this.maxHeroDamage = teamheroes.getMaxDamage(teamVillains.getMembers());
        this.maxVillainDamage = teamVillains.getMaxDamage(teamheroes.getMembers());

        // Reset Health
        teamheroes.calcTotalHealth();
        teamVillains.calcTotalHealth();

        if (heroTeamWins) {
            maxVillainDamage = 0;
        } else {
            maxHeroDamage = 0;
        }
        startFight();
    }

    private void startFight()  {

        addAndPrint("\nFight!\n");
        addAndPrint("Battle Log:");

        Team winner = null;

        while(winner == null) {

            winner = getAttackResult(teamheroes, teamVillains, maxHeroDamage);

            if (winner != null) {
                break;
            }

            winner = getAttackResult(teamVillains, teamheroes, maxVillainDamage);
        }

        addAndPrint("Fight Finished\n");
        addAndPrint(winner.getName() + " has Won the Battle!");
    }

    private Team getAttackResult(Team t1, Team t2, int maxT1Damage)  {

        // Calculate random damage t1 to t2
        int damageToW2 = (int) Math.round( maxT1Damage * Math.random() );

        // Apply damage to health
        if (damageToW2 > 0) {
            t2.totalHealth -= damageToW2;
            addAndPrint(String.format("%s Attacks %s and deals %d Damage", t1.getName(), t2.getName(), damageToW2));
        } else {
            addAndPrint(String.format("%s Attacks %s and missed!", t1.getName(), t2.getName()));
        }

        addAndPrint(String.format("%s Has  %d Health %n", t2.getName(), t2.totalHealth));

        // Check death
        if (t2.totalHealth <= 0) {
            return t1;
        } else {
            return null;
        }
    }
}
