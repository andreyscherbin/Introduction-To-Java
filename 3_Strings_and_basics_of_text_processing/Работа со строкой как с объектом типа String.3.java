package com.company;

public class Main {

    /*
     * Проверить является ли заданное слово палиндромом.
     */
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("топот");
        boolean flagPolindromWord = true;
        for (int i = 0; i < string.length(); i++) {
            char ch1, ch2;
            ch1 = string.charAt(i);
            ch2 = string.charAt((string.length() - 1) - i);
            if (ch1 != ch2) {
                flagPolindromWord = false;
            }
        }
        System.out.println(flagPolindromWord);
    }
}
