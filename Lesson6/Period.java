package com.company.Lesson6;


 /*
Создать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами:
секундами, минутами и часами. Создать метод для получения полного количества секунд в объекте
Создать два конструктора: первый принимает общее количество секунд, второй - часы,
минуты и секунды по отдельности. Создать метод для вывода данных.
Написать программу для тестирования возможностей класса.
 */
         public  class Period {
                 private int sec;
                 private int min;
                 private int hour;

                 private int fullsec;
                 public Period(int sec, int min, int hour) {
                     this.hour = hour;
                     this.min = min;
                     this.sec = sec;
                 }

                 public Period(int fullsec) {
                     this.fullsec = fullsec;
                 }

                 //methods
                 public void Fullsecinmin() {
                     fullsec = sec + (min * 60) + (hour * 60 * 60);
                 }

                 public void printFullsec() {
                     System.out.println(getFullSec());
                 }


                 public int getFullSec() {
                     return this.fullsec;
                 }

                 public int getSec() {
                     return this.sec;
                 }

                 public int getMin() {
                     return this.min;
                 }

                 public int getHour() {
                     return this.hour;
                 }

                 public void setFullSec(int fullSec) {
                 }

                 public void setSec(int sec) {
                     this.sec = sec;
                 }

                 public void setMin(int fullMin) {
                     this.min = min;
                 }

                 public void setHour(int Hour) {
                     this.hour = hour;
                 }
             }


