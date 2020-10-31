package by.htp.module6.logic;

import by.htp.module6.entity.Note;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileNote {

    public List<Note> readFile(String nameFile) throws IOException {

        FileReader fileBooks = new FileReader(nameFile);
        Scanner scan = new Scanner(fileBooks);
        int i = 0;
        List<Note> books = new ArrayList<Note>();

        while (scan.hasNextLine()) {

            String title = scan.nextLine();
            String date = scan.nextLine();
            String email = scan.nextLine();
            String line;
            StringBuilder text = new StringBuilder();
            do {
                line = scan.nextLine();
                text.append(line);
                text.append("\n");
            }
            while (!line.equals("") && scan.hasNextLine());
            books.add(new Note(title, date, email, text.toString()));
        }

        fileBooks.close();
        return books;
    }

    public boolean writeFile(List<Note> notes, String nameFile) throws IOException {

        FileWriter myWriter = new FileWriter(nameFile);

        for (Note note : notes) {
            myWriter.write(note.getTitle());
            myWriter.write("\n");
            myWriter.write(note.getDate());
            myWriter.write("\n");
            myWriter.write(note.getEmail());
            myWriter.write("\n");
            myWriter.write(note.getText());
        }

        myWriter.close();
        return true;
    }
}
