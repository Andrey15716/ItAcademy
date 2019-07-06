package com.company.Lesson7.Hero;

import com.company.Lesson7.Enemy.Enemy;

public class Mage extends Heroname {
    private static final int HEALTH=50;
    public Mage(String name, Rivals rivals) {
        super(name, HEALTH, rivals);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Достает меч");
        enemy.takeDamage(34);
    }
}
