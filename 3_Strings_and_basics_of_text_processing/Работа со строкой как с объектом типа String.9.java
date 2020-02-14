package com.company;

public class Main {

    /*
     * Подсчитать количество строчных(маленьких) и прописных(больших) букв в введенной строке. Учитывать только
     * английские буквы.
     */
    public static void main(String[] args) {

        String somestring = "abcdABCD";
        int counterLowerCase = 0, counterUpperCase = 0;
        for (int i = 0; i < somestring.length(); i++) {
            char ch = somestring.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                counterUpperCase++;
            }
            if (ch >= 'a' && ch <= 'z') {
                counterLowerCase++;
            }
        }
        System.out.printf("LowerCase = %d, UpperCase = %d", counterLowerCase, counterUpperCase);
    }
}
