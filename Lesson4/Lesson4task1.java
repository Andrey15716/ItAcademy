package Lesson4;

/*Напишите программу, которая печатает массив сначала в
обычном порядке, затем в обратном.*/

public class Lesson4task1 {
    public static void main(String[] args) {
        String[] a = { " 2 "," 3 "," 4 "," 5 "};
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]);
            System.out.println();
        }
            int n = a.length;
            String temp;

        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }

        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
    }
}
