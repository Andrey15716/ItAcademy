package com.company.Lesson7;

import com.company.Lesson7.Enemy.Enemy;
import com.company.Lesson7.Hero.*;

public class TrainingGround{
    private static int health;

    public static void main(String[] args) {
        Heroname HUMAN= new Warrior("Человек", Rivals.HUMAN);
        Heroname ELF= new Warrior("Эльф", Rivals.ELF);
        Heroname DWARF=new Mage("Леголас", Rivals.DWARF);

        HUMAN.attackEnemy();
        ELF.attackEnemy();
        DWARF.attackEnemy();
    }
}
