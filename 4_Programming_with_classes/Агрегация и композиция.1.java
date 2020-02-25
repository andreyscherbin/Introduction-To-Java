package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Main {

    /*
     * Создать объект класса Текст, использя Предложение,Слово.Методы:дополнить текст, вывести на консоль текст,
     * заголовок текста.
     */

    private static class Text {

        String tittle;
        Sentence[] sentences;

        Text(Sentence[] sentences, String tittle) {
            this.sentences = sentences;
            this.tittle = tittle;
        }

        private void printTextOnConsole() {
            System.out.println(this.toString());
        }

        private void printTittle() {
            System.out.println(tittle);
        }

        private void addSentence(Sentence sentence) {
            Sentence[] sentences = new Sentence[this.sentences.length + 1];
            int i = 0;
            for (Sentence s : this.sentences) {
                sentences[i] = s;
                i++;
            }
            sentences[i] = sentence;
            this.sentences = sentences;
        }

        @Override
        public String toString() {
            String return_string = "";
            for (Sentence sentence : sentences) {
                return_string += sentence.toString();
                return_string += ".";
            }
            return return_string;
        }
    }

    private static class Sentence {

        Word[] words;

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

    private static class Word {

        String word;

        @Override
        public String toString() {
            return word;
        }

        Word(String word) {
            this.word = word;
        }
    }

    public static void main(String[] args) {

        Word[] words1 = {new Word("Hello"),
                new Word("my"),
                new Word("friend")};

        Word[] words2 = {new Word("How"),
                new Word("are"),
                new Word("you?")};

        Sentence[] sentences = {new Sentence(words1), new Sentence(words2)};
        Text text = new Text(sentences, "HELLO");
        text.printTextOnConsole();
        text.printTittle();
        Sentence sentence = new Sentence(words1);
        text.addSentence(sentence);
        text.printTextOnConsole();
    }
}

