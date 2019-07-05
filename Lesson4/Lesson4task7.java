package com.company;

/*Написать программу, эмулирующую выдачу случайной карты из
колоды в 52 карты. Вывести результат в формате "Карта of Масть". Например, "AceofSpades".
Валет- Jack, Дама-Queen,Король-King,Туз-Ace,Червы-Hearts,Пики-Spades, Трефы-Clubs,
Бубны-Diamonds */

public class Lesson4task7 {
    public static void main(String[] args) {
        String[] cards = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] mast = {"Hearts", "Spades", "Clubs", "Diamonds"};
        int card = getRandomNumberInRange(1, 52);
        int index1 = card - Math.floorDiv(card, 4) * 4 - 1;
        System.out.println("загадана карта № " + card);
        System.out.println(cards[index1] + " of " + mast[card % 4]);
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}

