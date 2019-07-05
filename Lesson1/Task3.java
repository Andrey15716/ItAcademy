package com.company;

import java.util.Scanner;

/*
 Написать программу, которая считывает год, введённый пользователем, и
 определяет, является ли этот год високосным.
    Год считается високосным, если он делится без остатка на 4. Однако, если
год также делится на 100, то этот год не високосный, за исключением годов,
делящихся на 400.
    Например:
    1992 - високосный
    1900 - не високосный
    2000 - високосный
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        int year4 = year%4;
        int year100 = year%100;
        int year400 = year%400;
        if ((year4==0 &&  year100 !=0 )  || (year400==0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Не високосный год");
        }
    }
}