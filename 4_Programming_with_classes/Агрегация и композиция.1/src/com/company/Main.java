package com.company;

public class Main {

    /*
     * Создать объект класса Текст, использя Предложение,Слово.Методы:дополнить текст, вывести на консоль текст,
     * заголовок текста.
     */
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

