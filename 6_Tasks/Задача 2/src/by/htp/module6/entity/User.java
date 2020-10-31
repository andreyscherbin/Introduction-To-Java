package by.htp.module6.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {

    private static final long serialVersionUID = 3L;

    private String name;
    private Notebook notebook;

    public User() {

    }

    public User(String user) {

        this.name = name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setNotebook(Notebook notebook) {

        this.notebook = notebook;
    }

    public Notebook getNotebook() {

        return notebook;
    }


    public Note getNote(String title) {

        return notebook.getNoteLogic().getNote(title, notebook.getNotes());
    }

    public Note getNote(String title, String date) {

        return notebook.getNoteLogic().getNote(title, date, notebook.getNotes());
    }

    public List<Note> getSortedNotes() {

        return notebook.getNoteLogic().getSortedNotes(notebook.getNotes());
    }

    public List<Note> getNotesByWord(String word) {

        return notebook.getNoteLogic().getNotesByWord(word, notebook.getNotes());
    }

    public boolean addNote(Note note) {

        return notebook.addNote(note);
    }

    public boolean removeNote(String title) {

        return notebook.removeNote(title);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((notebook == null) ? 0 : notebook.hashCode());
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
        User user = (User) obj;

        if (name == null) {
            if (user.name != null)
                return false;
        } else if (!name.equals(user.name))
            return false;
        if (notebook == null) {
            if (user.notebook != null)
                return false;
        } else if (!notebook.equals(user.notebook))
            return false;
        return true;
    }

    @Override
    public String toString() {

        return "Name: " + name;
    }
}
