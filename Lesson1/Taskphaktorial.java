package com.company;
import java.util.Scanner;

/*Написать алгоритм расчета факториала , используя циклы (
for
и
while
)*/

public class Taskphaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("введите число:");
        int n = sc.nextInt();
        System.out.println("Факториал числа через for " + n + " равен " + factorialFor(n));
        System.out.println("Факториал числа через while " + n + " равен " + factorialWhile(n));
    }
            public static long factorialFor(int n){
            int factorial =1;
            for (int i=1; i<=n; i++) {
                factorial = factorial * i;
            }
            return factorial;
            }

            public static long factorialWhile(int n){
            long factorial=1;
            int i=1;
            while (i<=n){
                factorial=factorial*i;
                i++;
            }
            return factorial;
        }
    }

