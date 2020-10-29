package by.htp.module4.entity;

import java.io.Serializable;

public class Word implements Serializable {

    private static final long serialVersionUID = 1L;

    private String word;

    public Word() {

    }

    public Word(String word) {

        this.word = word;
    }

    public void setWord(String word) {

        this.word = word;

    }

    public String getWord() {

        return word;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Word word = (Word) obj;

        if (word == null) {
            if (word.word != null)
                return false;
        } else if (!word.equals(word.word))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((word == null) ? 0 : word.hashCode());
        return result;
    }

    @Override
    public String toString() {

        return "Word: " + word;

    }
}
