package com.company;

import java.util.Random;
/*
Создать массив из 3 случайных целых чисел из отрезка [10;99], вывести его на экран в строку.
Определить и вывести на экран сообщение о том, является ли массив строго возрастающей последовательностью*/

public class Lesson4task4 {
    public static void main(String[] args) {

        int[] Mass= new int[40];

        for (int i = 0; i < Mass.length; i++) {
            Mass[i]=(int) Math.floor(Math.random() * 90)+10;
            System.out.print(Mass[i] + " ");
        }
        boolean flag=true;

        for (int i = 1; i < Mass.length; i++) {
            if(Mass[i]<=Mass[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Массив является строго возрастающей последовательностью");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью");
        }
    }
}