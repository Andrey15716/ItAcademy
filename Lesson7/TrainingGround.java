package com.company.Lesson7;

import com.company.Lesson7.Hero.Archer;
import com.company.Lesson7.Hero.Heroname;
import com.company.Lesson7.Hero.Mage;
import com.company.Lesson7.Hero.Warrior;

public class TrainingGround{
    private static int health;

    public static void main(String[] args) {

        Heroname Ork= new Warrior("Ork", health);
        Heroname Druid= new Archer("Druid", health);
        Heroname Gendolf=new Mage("Gendolf", health);

        Ork.AttackEnemy();
        Druid.AttackEnemy();
        Gendolf.AttackEnemy();
    }
}
