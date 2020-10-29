package by.htp.module4.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Text implements Serializable {

    private static final long serialVersionUID = 3L;

    private String title;
    private List<Sentence> sentences;

    {
        sentences = new ArrayList<Sentence>();
    }

    public Text() {

    }

    public Text(String title) {

        this.title = title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getTittle() {

        return title;
    }

    public void setSentences(List<Sentence> sentences) {

        this.sentences = sentences;
    }

    public List<Sentence> getSentences() {

        return sentences;
    }

    public boolean addSentence(Sentence sentence) {

        return sentences.add(sentence);
    }

    public boolean removeSentence(Sentence sentence) {

        return sentences.remove(sentence);
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Text text = (Text) obj;

        if (title == null) {
            if (text.title != null)
                return false;
        } else if (!title.equals(text.title))
            return false;
        if (sentences == null) {
            if (text.sentences != null)
                return false;
        } else if (!sentences.equals(text.sentences))
            return false;
        return true;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((sentences == null) ? 0 : sentences.hashCode());
        return result;

    }

    @Override
    public String toString() {

        return "Tittle: " + title + "Sentences: " + sentences;

    }

}
