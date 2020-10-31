package by.htp.module6.logic;

import by.htp.module6.entity.Note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NoteLogic {

    public Note getNote(String title, List<Note> notes) {

        for (Note note : notes) {
            if (note.getTitle().equals(title))
                return note;
        }
        return null;
    }

    public Note getNote(String title, String date, List<Note> notes) {

        for (Note note : notes) {
            if (note.getTitle().equals(title) && note.getDate().equals(date))
                return note;
        }
        return new Note();
    }

    public List<Note> getSortedNotes(List<Note> notes) {

        Collections.sort(notes);
        return notes;
    }

    public List<Note> getNotesByWord(String word, List<Note> notes) {

        List<Note> notesByWord = new ArrayList<Note>();

        for (Note note : notes) {

            Pattern pattern = Pattern.compile(word, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(note.getText());

            if (matcher.find()) {
                notesByWord.add(note);
            }
        }
        return notesByWord;
    }
}
