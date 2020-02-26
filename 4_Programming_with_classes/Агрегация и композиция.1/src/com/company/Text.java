package com.company;

public class Text {

    private String tittle;
    private Sentence[] sentences;

    Text(Sentence[] sentences, String tittle) {
        this.sentences = sentences;
        this.tittle = tittle;
    }

    public void printTextOnConsole() {
        System.out.println(this.toString());
    }

    public void printTittle() {
        System.out.println(tittle);
    }

    public void addSentence(Sentence sentence) {
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
