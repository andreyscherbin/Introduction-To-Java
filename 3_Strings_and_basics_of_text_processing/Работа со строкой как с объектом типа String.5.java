package com.company;

public class Main {

    /*
     * Подсчитать, сколько раз среди символов заданной строки встречается буква "а".
     */
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("информатика");
        int counterSymbolA = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'а') {
                counterSymbolA++;
            }
        }
        System.out.println(counterSymbolA);
    }
}
