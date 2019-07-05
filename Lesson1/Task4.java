package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите день:");
        int day = sc.nextInt();
        System.out.println("введите месяц:");
        int mon = sc.nextInt();
        System.out.println("введите год:");
        int year = sc.nextInt();


      switch (mon) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:{
                if (day < 32)
                System.out.print("Верная дата, 31 день");
                break;}
            case 4:
            case 6:
            case 9:
            case 11: {
                if (day<31)
                System.out.print("Верная дата, 30 дней");
                break;}
            case 2:
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)){
                    System.out.print("Високосный год");
                break;
                }else
            System.out.print("Не високосный год");
                break;

                default:
                System.out.println("Неверная дата");
                break;

        }
    }
    }


