package com.company.Lesson7;

import com.company.Lesson7.Enemy.Enemy;

public class Zombie extends Enemy {
    private boolean wasKilled=false;
private static final int HEALTH=45;

public Zombie(){
    super(HEALTH);
}
@Override
    public void Dead(){
    if(!wasKilled){
        setHealth(HEALTH);
        wasKilled=true;
        System.out.println("Зомби умирает");
        System.out.println("Зомби оживает");

    } else {
        setHealth(0);
        System.out.println("Зомби повержен навсегда");
    }
}
}
