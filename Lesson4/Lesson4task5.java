package com.company;

/*Создать двухмерный квадратный массив, и
заполнить его
"бабочкой"
*/

public class Lesson4task5 {
    public static void main(String[] args) {
        String[][] array = new String[4][4];
        int i;
        int j;

        for (i = 0; i < array.length / 2 + 1; i++) {
            for (j = 0; j < array[i].length; j++) {
                if ((j < i) || (j >= (array[i].length - i))) {
                    array[i][j] = "0";
                } else {
                    array[i][j] = "1";
                }
            }
            }
            for (i = array.length - 1; i >= array.length / 2; i--) {
                for (j = 0; j < array[i].length; j++) {
                    if ((j < (array[i].length - 1 - i)) || (j > i)) {
                        array[i][j] = "0";
                    } else {
                        array[i][j] = "1";
                    }
                }
            }
            for (i = 0; i < array.length/2+1; i++) {
                for (j = 0; j < array[i].length; j++) {
                    if ((j < i) || (j >= (array[i].length - 1))) {
                        array[i][j] = " ";
                    } else {
                        array[i][j] = "*";
                    }
                }
            }
            for (i = array.length - 1; i >= array.length / 2; i--) {
                for (j = 0; j < array[i].length; j++) {
                    if ((j < (array[i].length - 1 - i)) || (j > i)) {
                        array[i][j] = " ";
                    } else {
                        array[i][j] = "*";
                    }
                }
            }
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println(" ");
            }
        }
    }
