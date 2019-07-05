package com.company;

import java.util.Arrays;

/*Написать метод equals, который определяет, равны ли между
собой соответствующие элементы
2-х двумерных массивов.*/

public class Lesson4task6 {
    public static void main(String[] args) {
        String[][] aa = {{"11", "33"}, {"33", "44"}};
        String[][] bb = {{"11", "22"}, {"33", "44"}};
        equals(aa, bb);
    }
        public static void equals(String[][] aa,String[][] bb){
        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.print(aa[i][j]+ "\t");
            }
                System.out.println();
        }
        for (int i = 0; i < bb.length; i++) {
            for (int j = 0; j < bb[i].length; j++) {
                System.out.print(bb[i][j] + "\t");
            }
                System.out.println();
        }

        for (int i = 0; i < aa.length; i++) {
            for (int j = 0; j < aa[i].length; j++) {
                System.out.println(bb[i][j] + "\t");

                if (aa[i][j].equals(bb[i][j])){
                    System.out.println("Элементы массивов равны");
                }else {
                    System.out.println("Элементы массивов не равны");
                }
            }
        }
    }
}