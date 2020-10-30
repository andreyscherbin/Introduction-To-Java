package by.htp.module6.logic;

import by.htp.module6.entity.Book;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileBook {

    public List<Book> readFile(String nameFile) throws IOException {

        FileReader fileBooks = new FileReader(nameFile);
        Scanner scan = new Scanner(fileBooks);
        int i = 0;
        List<Book> books = new ArrayList<Book>();

        while (scan.hasNextLine()) {

            String string = scan.nextLine();
            String[] strings = string.split("/");
            String title, author;
            boolean isElectronic;
            title = strings[0];
            author = strings[1];
            isElectronic = strings[2].equals("да") == true ? true : false;
            books.add(new Book(title, author, isElectronic));
            i++;
        }

        fileBooks.close();
        return books;
    }
}
