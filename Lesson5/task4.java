package com.company.Lesson5;
/* Написать функцию, принимающую в качестве параметров имя, фамилию и
отчество и возвращающую
инициалы
в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
регистре, а результирующая строка должна быть в верхнем.*/

public class task4 {
    public static void main(String[] args) {
        
        System.out.println(initials("антоненко", "Андрей", "сергеевич"));
    }

    public static String initials(String firstName, String lastName, String midName) {
        String initials=new String(firstName.charAt(0) + "." + lastName.charAt(0) + "." + midName.charAt(0) + ".");
       return initials.toUpperCase();
    }
}
