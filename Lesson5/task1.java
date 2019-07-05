package com.company.Lesson5;
/*
Написать два цикла, выполняющих многократное сложение строк, один с
помощью оператора сложения и String,
второй с помощью StringBuilder и метода append. Сравнить скорость их
выполнения*/

public class task1 {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        String string = "0";
        for (int i = 0; i < 9; i++) {
            string += string;
        }
        long endTime = System.nanoTime();

        System.out.println(endTime - startTime);

        long startTime2 = System.nanoTime();
        String string2 = "0";
        StringBuilder strBuild = new StringBuilder("0");
        for (int i = 0; i < 9; i++) {
            strBuild.append(string2);
        }
        long endTime2 = System.nanoTime();

        System.out.println(endTime2 - startTime2);
    }
}
