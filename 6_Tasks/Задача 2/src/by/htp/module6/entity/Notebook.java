package by.htp.module6.entity;

import by.htp.module6.logic.NoteLogic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notebook implements Serializable {

    private static final long serialVersionUID = 2L;

    private List<Note> notes;
    private NoteLogic noteLogic;

    {
        notes = new ArrayList<Note>();
    }

    public Notebook() {

    }

    public void setNotes(List<Note> notes) {

        this.notes = notes;
    }

    public List<Note> getNotes() {

        return notes;
    }

    public void setNoteLogic(NoteLogic noteLogic) {

        this.noteLogic = noteLogic;
    }

    public NoteLogic getNoteLogic() {

        return noteLogic;
    }

    public boolean addNote(Note note) {

        Pattern pattern_date = Pattern.compile("(\\d{2})\\.(\\d{2})\\.(\\d{4})\\s(\\d{2}):(\\d{2})", Pattern.CASE_INSENSITIVE);
        Pattern pattern_email = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")" +
                "@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.)" +
                "{3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", Pattern.CASE_INSENSITIVE);
        Matcher matcher_date = pattern_date.matcher(note.getDate());
        Matcher matcher_email = pattern_email.matcher(note.getEmail());

        if (!matcher_date.find()) {
            return false;
        }
        if (!matcher_email.find()) {
            return false;
        }
        return notes.add(note);
    }

    public boolean removeNote(String title) {

        for (Note note : notes) {
            if (note.getTitle().equals(title)) {
                return notes.remove(note);
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((notes == null) ? 0 : notes.hashCode());
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
        Notebook notebook = (Notebook) obj;

        if (notes == null) {
            if (notebook.notes != null)
                return false;
        } else if (!notes.equals(notebook.notes))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return "Notes : " + notes;
    }
}
