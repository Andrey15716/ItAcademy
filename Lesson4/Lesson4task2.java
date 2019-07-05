package com.company;
/*Напишите программу, заносящую в массив первые 100
натуральных чисел, делящихся на 13 или на 17, и печатающую его*/
public class Lesson4task2 {
    public static void main(String[] args) {
        int[] mas = new int[100];
        int count = 0;
        int chislo = 0;
        while (count < 100) {
            chislo++;
            if ((chislo % 13 == 0) | (chislo % 17 == 0)) {
                mas[count] = chislo;
                count++;
            }
        }
        for (int i = 0; i < mas.length - 1; i++) {
            System.out.println(count + ":  " + mas[i]);
        }
    }
}
