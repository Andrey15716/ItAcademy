package com.company;

import java.util.Scanner;

/* Запросить у пользователя 2 слова. Если они одинаковы вывести
"Отлично! Слова одинаковы".
Если они отличаются лишь регистром- "Хорошо. Почти одинаковы"
Если они отличаются, но одной длины - "Ну, хотя бы они одной длины" Использовать
методы класса String: equals (Stringstring), equalsIgnoreCase (String string),
length ()
*/
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();

        if (text1.equals(text2)) {
            System.out.println("Отлично!Слова одинаковы");
        } else if (text1.equalsIgnoreCase(text2)) {
            System.out.println("Хорошо.Почти одинаковы");
        } else if (text1.length() == text2.length()) {
            System.out.println("Ну,хотябы одной длины");
        } else {
            System.out.println("Все неверно!");
        }
    }
}
