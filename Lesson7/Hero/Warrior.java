package com.company.Lesson7.Hero;

import com.company.Lesson7.Enemy.Enemy;

public class Warrior extends Heroname {
    private static final int HEALTH=210;
    public Warrior(String name, Rivals rivals) {
        super(name,HEALTH, rivals);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Бросается в атаку!");
        enemy.takeDamage(54);
    }
}
