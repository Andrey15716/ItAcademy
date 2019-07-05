package com.company.Lesson5;

/* Написать функцию, заменяющую несколько последовательных
одинаковых символов в строке одним. Пример: aaabbcdeef - >abcde */

import java.util.ArrayList;

public class task6 {
    public static void main(String[] args) {
        String text = "stoooooopppppppppppppppppp";
        String result = text.replaceAll("([a-zA-Z])\\1{1,}", "$1");
        System.out.println(result);
    }
}
