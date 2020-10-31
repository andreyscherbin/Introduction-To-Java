package by.htp.module6.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Note implements Serializable, Comparable<Note> {

    private static final long serialVersionUID = 1L;

    private String title;
    private String date;
    private String email;
    private String text;

    public Note() {

    }

    public Note(String title, String date, String email, String text) {

        this.title = title;
        this.date = date;
        this.email = email;
        this.text = text;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public void setDate(String date) {

        this.date = date;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getTitle() {

        return title;
    }

    public String getDate() {

        return date;
    }

    public String getEmail() {

        return email;
    }

    public String getText() {

        return text;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
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
        Note note = (Note) obj;

        if (title == null) {
            if (note.title != null)
                return false;
        } else if (!title.equals(note.title))
            return false;
        if (date == null) {
            if (note.date != null)
                return false;
        } else if (!date.equals(note.date))
            return false;
        if (email == null) {
            if (note.email != null)
                return false;
        } else if (!email.equals(note.email))
            return false;
        if (text == null) {
            if (note.text != null)
                return false;
        } else if (!text.equals(note.text))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return "Title: " + title + " Date: " + date + " email: " + email + " text: " + text;
    }

    @Override
    public int compareTo(Note note) {

        String date1 = this.getDate();
        String date2 = note.getDate();

        List<Integer> values1 = new ArrayList<Integer>();
        List<Integer> values2 = new ArrayList<Integer>();

        Pattern pattern = Pattern.compile("\\d+", Pattern.CASE_INSENSITIVE);
        Matcher matcher1 = pattern.matcher(date1);
        Matcher matcher2 = pattern.matcher(date2);
        while (matcher1.find() && matcher2.find()) {

            values1.add(Integer.parseInt(matcher1.group()));
            values2.add(Integer.parseInt(matcher2.group()));
        }

        if (values1.get(2) < values2.get(2))
            return -1;
        if (values1.get(2) > values2.get(2))
            return 1;
        if (values1.get(1) < values2.get(1))
            return -1;
        if (values1.get(1) > values2.get(1))
            return 1;
        if (values1.get(0) < values2.get(0))
            return -1;
        if (values1.get(0) > values2.get(0))
            return 1;
        if (values1.get(3) < values2.get(3))
            return -1;
        if (values1.get(3) > values2.get(3))
            return 1;
        if (values1.get(4) < values2.get(4))
            return -1;
        if (values1.get(4) > values2.get(4))
            return 1;
        return 0;
    }
}
