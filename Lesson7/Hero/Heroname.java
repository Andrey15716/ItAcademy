package com.company.Lesson7.Hero;

import com.company.Lesson7.Mortal;

public abstract class Heroname {
    private String name;
    private int health;
    private int damage;

    public Heroname(String name, int health) {
        this.name = name;
        this.health = health;
        this.damage=damage;
    }

    public void AttackEnemy() {
        System.out.println(name + " -Герой атакует врага!");
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }


    public void takeDamage(int i) {
        if (health <= damage) {
            Dead();
        } else {
            System.out.println("Герой получает " + damage + " урона");
            health -= damage;
        }
    }
    @Override
    public void Dead(){
        System.out.println("Герой проиграл");
        health = 0;
    }
}

