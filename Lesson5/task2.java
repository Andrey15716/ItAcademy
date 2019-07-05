package com.company.Lesson5;
/*Заменить все грустные смайлы
в строке на весёлые*/

public class task2 {
    public static void main(String[] args) {
        String string = ":(  :(";
        System.out.println(string);

        string = string.replace("(", ")");
        System.out.println(string);
    }
}
