package by.htp.module6.main;

import by.htp.module6.entity.Note;
import by.htp.module6.entity.Notebook;
import by.htp.module6.entity.User;
import by.htp.module6.logic.FileNote;
import by.htp.module6.logic.NoteLogic;
import by.htp.module6.view.NoteView;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    /*   Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками в Блокноте. Каждая Заметка это:
         Заметка (тема, дата создания, e-mail, сообщение).

         Общие пояснения к практическому заданию.
         - В начале работы приложения данные должны считываться из файла, в конце работы - сохраняться в файл.
         - У пользователя должна быть возможность найти запись по любому параметру или по группе параметров ( группу
         параметров можно определить самостоятельно), получить требуемые записи в отсортированном виде, найти
         записи, текстовое поле которой содержит определенное слово, а также добавить новую запись.
         - Особое условие: поиск, сравнение и валидацию вводимой информации осуществлять с использованием регулярных
         выражений.
         - Особе условие : проверку введенной информации на валидность должен осуществлять код, непосредственно доба-
         вляющий информацию
     */
    public static void main(String[] args) throws IOException {

        FileNote fileNote = new FileNote();
        NoteLogic noteLogic = new NoteLogic();
        NoteView noteView = new NoteView();
        User user = new User();
        Notebook notebook = new Notebook();
        notebook.setNotes(fileNote.readFile("notes.txt"));
        user.setNotebook(notebook);
        user.getNotebook().setNoteLogic(noteLogic);

        int inputNumber = 0;
        String inputString = "";
        String word;
        String title, date, email, text;
        Scanner scan = new Scanner(System.in);

        while (!"7".equals(inputString)) {
            System.out.println("1. Для поиска записи по названию введите 1");
            System.out.println("2. Для поиска записи по названию и дате введите 2");
            System.out.println("3. Для получения записей в отсортированном по дате порядке ввведите 3");
            System.out.println("4. Для поиска записи, текстовое поле которой содержит определенное слово ввведите 4");
            System.out.println("5. Для добавления записи ввведите 5");
            System.out.println("6. Для удаления записи ввведите 6");
            System.out.println("7. Для выхода из приложения введите 7");
            inputString = scan.nextLine();

            try {
                inputNumber = Integer.parseInt(inputString);
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод");
            }

            switch (inputNumber) {
                case 1:
                    System.out.println("Введите название записи");
                    title = scan.nextLine();
                    noteView.print(user.getNote(title));
                    break;
                case 2:
                    System.out.println("Введите название записи");
                    title = scan.nextLine();
                    System.out.println("Введите дату");
                    date = scan.nextLine();
                    noteView.print(user.getNote(title, date));
                    break;
                case 3:
                    noteView.print(user.getSortedNotes());
                    break;
                case 4:
                    System.out.println("Введите слово для поиска в записи");
                    word = scan.nextLine();
                    noteView.print(user.getNotesByWord(word));
                    break;
                case 5:
                    System.out.println("Введите название записи");
                    title = scan.nextLine();
                    System.out.println("Введите дату");
                    date = scan.nextLine();
                    System.out.println("Введите email");
                    email = scan.nextLine();
                    System.out.println("Введите текст");
                    text = scan.nextLine();
                    Note note = new Note(title, date, email, text);
                    noteView.print(user.addNote(note));
                    break;
                case 6:
                    System.out.println("Введите название записи");
                    title = scan.nextLine();
                    noteView.print(user.removeNote(title));
                    break;
                default:
                    System.out.println("Повторите ввод");
                    break;
            }
        }
        fileNote.writeFile(user.getNotebook().getNotes(), "notes.txt");
    }
}
