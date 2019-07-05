package com.company.Lesson5;
/*Написать функцию, принимающую 2 параметра: строку и слово-и
возвращающую true, если строка начинается и заканчивается этим словом*/

public class task3 {
    public static void main(String[] args) {

            System.out.println(firstWord("hella", "hello"));
        }

        public static boolean firstWord(String string, String word) {
            return string.startsWith(word);
        }
    }
