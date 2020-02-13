package com.company;

public class Main {

    /*
     * С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт".
     */
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("информатика");
        String new_string = string.substring(7, 8);
        new_string = new_string.concat(string.substring(3, 5));
        new_string = new_string.concat(string.substring(7, 8));
        System.out.println(new_string);

    }
}
