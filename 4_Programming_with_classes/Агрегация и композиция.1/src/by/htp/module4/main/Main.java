package by.htp.module4.main;

import by.htp.module4.entity.Word;
import by.htp.module4.entity.Sentence;
import by.htp.module4.entity.Text;

public class Main {

    /*
     * Создать объект класса Текст, использя Предложение,Слово.Методы:дополнить текст, вывести на консоль текст,
     * заголовок текста.
     */
    public static void main(String[] args) {

        Text text = new Text("HELLO");
        Sentence sentence = new Sentence();
        sentence.addWord(new Word("hello"));
        sentence.addWord(new Word("my"));
        sentence.addWord(new Word("dear"));
        sentence.addWord(new Word("friend"));
        text.addSentence(sentence);

        System.out.println(text.getTittle());
        System.out.println(text);

    }
}

