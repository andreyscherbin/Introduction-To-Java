package by.htp.module6.view;

import by.htp.module6.entity.Note;

import java.util.List;


public class NoteView {

    public void print(Note note) {

        System.out.println(note);
    }

    public void print(List<Note> notes) {

        System.out.println(notes);
    }

    public void print(boolean result) {

        System.out.println(result);
    }

}
