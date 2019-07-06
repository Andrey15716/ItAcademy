package com.company.Lesson7.Enemy;

import com.company.Lesson7.Hero.Heroname;
import com.company.Lesson7.Mortal;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health){
    this.health=health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
    if (health<=damage) {
        Dead();
    }else{
    System.out.println("Враг получил " + damage + " повреждений");
    health-=damage;
    }
    }
    public void attackHero(Heroname hero){
        System.out.println("Враг атакует героя");
        hero.takeDamage(20);
    }
    @Override
    public boolean isAlive(){
        return health>0;
    }
    @Override
    public void Dead(){
        health=0;
        System.out.println("Герой проиграл");

    }
}
