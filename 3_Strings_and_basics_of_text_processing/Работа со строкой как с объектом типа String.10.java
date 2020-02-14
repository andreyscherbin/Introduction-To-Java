package com.company;

public class Main {

    /*
     * Строка X состоит из нескольких предложений, каждое из которых кончается точкой, восклицательным
     * или вопросительным знаком. Определить количество преложений в строке X.
     */
    public static void main(String[] args) {

        String somestring = "Hello my friend how are you? I'm fine! What about you? Oh, me too.";
        int counterSentence = 0;
        for (int i = 0; i < somestring.length(); i++) {
            char ch = somestring.charAt(i);
            if (ch == '!' || ch == '?' || ch == '.') {
                counterSentence++;
            }
        }
        System.out.printf("counterSentence = %d", counterSentence);
    }
}
