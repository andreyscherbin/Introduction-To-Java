package com.company;

public class Main {

    /*
     * Из заданной строки получить новую, повторив каждый символ дважды.
     */
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("информатика");
        int counterSymbolA = 0;
        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            string.insert(i, ch);
            i++;
        }
        System.out.println(string);

    }
}
