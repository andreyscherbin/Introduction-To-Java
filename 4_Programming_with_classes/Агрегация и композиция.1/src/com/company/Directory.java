package com.company;

public class Directory {
    File[] files;

    Directory(File[] files) {
        this.files = files;
    }

    public void create(int index, String nameFile) {

        files[index - 1].create(nameFile);
    }

    public void rename(String name, String newName) {

        for (File file : files) {
            if (file.getName() == name) {
                file.rename(newName);
                break;
            }
        }
    }

    public void printOnConsole(String name) {

        for (File file : files) {
            if (file.getName() == name) {
                file.printOnConsole();
                break;
            }
        }
    }

    public void add(String name, String text) {
        for (File file : files) {
            if (file.getName() == name) {
                file.add(text);
                break;
            }
        }
    }

    public void delete(String name) {
        for (File file : files) {
            if (file.getName() == name) {
                file.delete();
                break;
            }
        }
    }
}
