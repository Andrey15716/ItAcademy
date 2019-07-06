package com.company.Lesson7;

import com.company.Lesson7.Enemy.Enemy;
import com.company.Lesson7.Hero.Archer;
import com.company.Lesson7.Hero.Heroname;
import com.company.Lesson7.Hero.Rivals;

public class BattleGround {
    public static void main(String[] args) {
        Heroname hero = new Archer("Человек", Rivals.HUMAN);
        Enemy enemy = new Zombie();
        fight(hero, enemy);
        throwIntoTrap(enemy);
    }

    private static void fight(Heroname hero, Enemy enemy) {

        while (hero.isAlive() && enemy.isAlive()) {
            hero.AttackEnemy(enemy);

            if (enemy.isAlive()) {
                enemy.attackHero(hero);

                if (!enemy.isAlive()) {
                    System.out.println("Герой победил!");
                    return;


                }
            }
        }
    }
    public static void throwIntoTrap(Mortal mortal) {
        mortal.Dead();
    }
}