package com.company;

public class Sentence {

    private Word[] words;

    Sentence(Word[] words) {
        this.words = words;
    }

    @Override
    public String toString() {
        String return_string = "";
        for (Word word : words) {
            return_string += word.toString();
            return_string += " ";
        }
        return return_string;
    }
}
