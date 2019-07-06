package com.company;
import java.util.Scanner;
/*Имеется целое число, определить является ли это число простым,
т.е.
делится без остатка только на 1 и себя*/

public class Taskcount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите число:");
        int a = sc.nextInt();
        int n;
        boolean result = false;
        for (n = 2; n < a; n++) {
            if (n % a == 0) {
                result = true;
                break;
            }
        }
        if (result) {
            System.out.println("Является простым числом");
        } else {
            System.out.println("Не является простым");
        }
    }
}


