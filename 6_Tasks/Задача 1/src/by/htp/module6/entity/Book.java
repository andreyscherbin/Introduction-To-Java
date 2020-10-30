package by.htp.module6.entity;

import java.io.Serializable;

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private boolean isElectronic;

    public Book() {

    }

    public Book(String title, String author, boolean isElectronic) {

        this.title = title;
        this.author = author;
        this.isElectronic = isElectronic;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public void setElectronic(boolean isElectronic) {

        this.isElectronic = isElectronic;
    }

    public String getTitle() {

        return title;
    }

    public String getAuthor() {

        return author;
    }

    public boolean getElectronic() {

        return isElectronic;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((isElectronic == true) ? 1 : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;

        if (title == null) {
            if (book.title != null)
                return false;
        } else if (!title.equals(book.title))
            return false;
        if (author == null) {
            if (book.author != null)
                return false;
        } else if (!author.equals(book.author))
            return false;
        if (isElectronic != book.isElectronic)
            return false;
        return true;
    }

    @Override
    public String toString() {

        return "Title: " + title + " Author: " + author + " Electronic? : " + isElectronic;
    }

}
