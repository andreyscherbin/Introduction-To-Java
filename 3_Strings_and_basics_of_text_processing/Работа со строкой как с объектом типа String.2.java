package com.company;

public class Main {

    /*
     * В строке вставить после каждого символа 'а' символ 'b'.
     */
    public static void main(String[] args) {

        StringBuilder string = new StringBuilder("hello how are you andrey");
        for (int i = 0; i < string.length(); i++) {
            int index = string.indexOf("a", i);
            if (index != -1) {
                string.insert(index + 1, "b");
                i = index + 1;
            }
        }
        System.out.println(string);
    }
}
