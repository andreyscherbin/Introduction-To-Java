package com.company;

public class Main {

    /*
     * Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. Случай
     * когда самых длинных слов может быть несколько не обрабатывать.
     */
    public static void main(String[] args) {

        String somestring = "one two three    four five three             andrey";
        String[] words = somestring.split(" ");
        String resstring = "";
        for (String word : words) {
            if (word.length() > resstring.length())
                resstring = word;
        }
        System.out.println(resstring);
    }
}
