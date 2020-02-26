package com.company;


public class Main {

    /*
    Создать объект класса Текстовый файл, используя классы Файл, Директория. Методы: создать, переименовать, вывести
    на консоль содержимое, дополнить, удалить.
     */
    public static void main(String[] args) {

        File[] files = new File[10];
        for (int i = 0; i < files.length; i++) {
            files[i] = new TextFile();
        }
        Directory directory = new Directory(files);
        directory.create(1, "andrey.txt");
        directory.create(2, "vasya.txt");
        directory.printOnConsole("andrey.txt");
        directory.add("andrey.txt", "new text");
        directory.printOnConsole("andrey.txt");
        directory.rename("andrey.txt", "andreyNewName.txt");
        directory.delete("andrey.txt");
    }
}

