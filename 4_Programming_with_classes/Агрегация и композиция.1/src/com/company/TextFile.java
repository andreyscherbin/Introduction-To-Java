package com.company;

import org.w3c.dom.Text;


public class TextFile extends File {

    TextFile(String name, String information,boolean isFileCreated) {
        super(name, information,isFileCreated);
    }
    TextFile(){
        this("","",false);
    }

    @Override
    public void create(String name) {
        super.name = name;
        super.isFileCreated = true;
    }

    @Override
    public void rename(String newName) {
        super.name = name;
    }

    @Override
    public void printOnConsole() {

        System.out.println(information);
    }

    @Override
    public void add(String text) {
        super.information+=text;
    }

    @Override
    public void delete() {

        isFileCreated = false;
        name = "";
        information = "";
    }
}
