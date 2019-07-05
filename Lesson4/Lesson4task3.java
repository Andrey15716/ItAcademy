package com.company;
import java.util.Arrays;
import java.util.Random;

/*Определить сумму элементов целочисленного массива,
расположенных между ближайшими минимальным и
максимальным значениями , не включая минимальное и максимальное значение.
0 2 3 9->5
0 2 3 9 1 1 1 0 1 2 9->2+3+1+2=8
0 2 9 8 0 4 9->2+4=6
 */
public class Lesson4task3 {
    private static final int N = 10;
    private static final int MIN = 1;
    private static final int MAX = 5;

    public static void main(String[] args) {
        int[] array = createArray(N, MIN, MAX);
        System.out.println("Array: " + Arrays.toString(array));

        int min = getMin(array);
        int[] indexesMin = getIndexesNumberToArray(array, min);
        System.out.printf("Минимальное значение = %d;\n ", min);

        int max = getMax(array);
        int[] indexesMax = getIndexesNumberToArray(array, max);
        System.out.printf("Максимальное значение = %d;\n ", max);

        sumsAllRangeBetweenMinAndMax(array, indexesMin, indexesMax);
    }

    private static int[] getIndexesNumberToArray(int[] array, int number) {
        int[] indexes = new int[0];
        if (array != null && array.length > 0) {
            indexes = new int[array.length];
            int count = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] == number) {
                    indexes[count++] = index;
                }
            }
            indexes = Arrays.copyOf(indexes, count);
        }
        return indexes;
    }

    private static int[] createArray(int size, int min, int max) {
        int[] array = new int[size > 0 ? size : 0];
        for (int index = 0; index < array.length; index++) {
            array[index] = (int) (Math.random() * (max - min + 1) + min);
        }
        return array;
    }

    private static int getMin(int[] array) {
        int result = 0;
        if (array != null && array.length > 0) {
            int min = array[0];
            for (int number : array) {
                if (min > number) {
                    min = number;
                }
            }
            result = min;
        }
        return result;
    }

    private static int getMax(int[] array) {
        int result = 0;
        if (array != null && array.length > 0) {
            int max = array[0];
            for (int number : array) {
                if (max < number) {
                    max = number;
                }
            }
            result = max;
        }
        return result;
    }

    private static void sumsAllRangeBetweenMinAndMax(int[] array, int[] indexesMin, int[] indexesMax) {
        if (array != null && indexesMin != null && indexesMax != null) {
            for (int min : indexesMin) {
                for (int max : indexesMax) {
                    int start = Math.min(min, max)+1;
                    int end = Math.max(min, max)-1;
                    int sum = 0;
                    for (int index = start; index <= end; index++) {
                        System.out.print(array[index] + " ");
                        sum += array[index];
                        if (index != end) {
                            System.out.print("+ ");
                        }
                    }
                    System.out.println("= " + sum + ";");
                }
            }
        }
    }
}