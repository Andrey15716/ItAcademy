package com.company.Lesson5;

/*Подсчитать количество слов в тексте. Учесть, что слова могут разделяться
несколькими пробелами.*/

public class task5{
    public static void main(String[] args) {
        String[] arr = "how are you".split("\\s");
        System.out.printf("Count [%d]", arr.length);
    }
}
