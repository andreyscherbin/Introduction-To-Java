package com.company;

public class Word {

    private String word;

    @Override
    public String toString() {
        return word;
    }

    Word(String word) {
        this.word = word;
    }
}
