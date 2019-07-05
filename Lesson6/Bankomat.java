package com.company.Lesson6;
/* Создать класс, описывающий банкомат. Набор купюр,
находящихся в банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20, 50 и 100.
Сделать методы для добавления денег в банкомат. Сделать функцию, снимающую деньги, которая принимает сумму
денег,а возвращает булевое значение-успешность выполнения операции.При снятии денег функция должна
распечатывать каким количеством купюр какого номинала выдаётся сумма.
Создать конструктор с тремя параметрами - количеством купюр каждого номинала*/
    public class Bankomat {
        private int note20;
        private int note50;
        private int note100;
        private int allMoney;

        private boolean takeMoney;

        public void addMoney(int addNote20, int addNote50, int addNote100) {
            note20 +=addNote20;
            note50 += addNote50;
            note100 += addNote100;
        }

        public void askMoney(int requestMoney) {
            if (requestMoney % 10 != 10) {
                System.out.println("Неверная сумма");
            } else {
                if (note100 * 100 + note50 * 50 + note20 * 20 >= requestMoney) {
                    takeMoney = true;
                } else {
                    takeMoney = false;
                    System.out.println("Недостаточно денег");
                }
            }
        }
    }

