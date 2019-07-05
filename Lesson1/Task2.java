package com.company;

import java.util.Scanner;

/*
 Имеется целое число, вводимое пользователем с консоли. Это число -
сумма денег в рублях.Вывести это число, добавив к нему слово "рубль" в правильном падеже
("рубль", "рублей", "рубля").
    a. Использовать конструкцию if-else.
    b. Модифицировать в switch в отдельном файле.
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        int rub = sum.nextInt();
        ifelsemet(rub);
        caseMet(rub);
    }

    public static void ifelsemet(int a) {
        int b = a % 10;
        int c = (a % 100) / 10;

        if (b == 1 && c != 1) {
            System.out.println("рубль");

        } else if ((b >= 2 && b <= 4) && c != 1) {
            System.out.println("рубля");
        } else {
            System.out.println("рублей");
        }
    }

    public static void caseMet(int a) {
        int b = a % 10;
        int c = a % 100 / 10;
        if (c != 1) {


            switch (b) {
                case 2:
                case 3:
                case 4:
                    System.out.println("рубля");
                    break;
                case 1:
                    System.out.println("рубль");
                    break;
                default:
                    System.out.println("рублей");
                    break;
            }

        }
        else {
            System.out.println("рублей");
        }
    }
}