package by.htp.module4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Sentence implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<Word> words;

    {
        words = new ArrayList<Word>();
    }

    public Sentence() {

    }

    public void setWords(List<Word> words) {

        this.words = words;
    }

    public List<Word> getWords() {

        return words;
    }

    public boolean addWord(Word word) {

        return words.add(word);
    }

    public boolean removeWord(Word word) {

        return words.remove(word);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sentence sentence = (Sentence) obj;

        if (words == null) {
            if (sentence.words != null)
                return false;
        } else if (!words.equals(sentence.words))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((words == null) ? 0 : words.hashCode());
        return result;

    }

    @Override
    public String toString() {

        return "Sentence: " + words.toString();

    }
}
