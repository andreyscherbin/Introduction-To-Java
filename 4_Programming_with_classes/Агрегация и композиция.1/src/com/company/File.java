package com.company;

public abstract class File {
    String name;
    String information;
    boolean isFileCreated;

    File(String name, String information,boolean isFileCreated){
        this.name = name;
        this.information = information;
        this.isFileCreated = isFileCreated;
    }

    public abstract void create(String name);

    public abstract void rename(String newName);

    public abstract void printOnConsole();

    public abstract void add(String text);

    public abstract void delete();

    public String getName(){
        return name;
    }
}
