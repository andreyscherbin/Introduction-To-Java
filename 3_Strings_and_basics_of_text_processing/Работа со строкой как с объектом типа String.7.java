package com.company;

public class Main {

    /*
     * Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было
     * введено "abc cde def", то должно быть выведено "abcdef".
     */
    public static void main(String[] args) {

        String string = new String("abc cde def");
        int counterSymbolA = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            if (ch == ' ') {
                string = string.substring(0, i) + string.substring(i + 1, string.length());
            }
        }
        for (int i = 0; i < string.length(); i++) {
            char char1 = string.charAt(i);
            for (int j = 0; j < string.length(); j++) {
                if (j != i) {
                    char char2 = string.charAt(j);
                    if (char1 == char2) {
                        string = string.substring(0, j) + string.substring(j + 1, string.length());
                    }
                }
            }
        }

        System.out.println(string);
    }
}
