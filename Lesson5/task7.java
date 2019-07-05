package com.company.Lesson5;
/* Написать функцию, принимающую на вход целое число, возвращающую
строку из 10 символов, дополненных слева нулями.
Если число выходит за размер 10 символов вернуть все нули.
Пример getString(22)-> 0000000022
Найти 3 способа решения задачи и определить наиболее быстрый способ*/

public class task7 {
    public static void main(String[] args) {
        int a= 34;
        String text = String.format("%010d", a);
        System.out.println(text);
    }
}
