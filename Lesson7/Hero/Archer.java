package com.company.Lesson7.Hero;

import com.company.Lesson7.Enemy.Enemy;

public class Archer extends Heroname {
    private static final int health=100;
    public Archer(String name, int health) {
        super(name,health);
    }
    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Сидит на лошади");
        enemy.takeDamage(15);
    }
}
