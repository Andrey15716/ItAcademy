package com.company.Lesson7.Hero;

import com.company.Lesson7.Enemy.Enemy;

public class Warrior extends Heroname {
    public Warrior(String name, int health) {
        super(name,health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Бросается в атаку!");
        enemy.takeDamage(54);
    }
}
