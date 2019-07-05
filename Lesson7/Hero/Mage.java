package com.company.Lesson7.Hero;

import com.company.Lesson7.Enemy.Enemy;

public class Mage extends Heroname {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Достает меч");
        enemy.takeDamage(34);
    }
}
