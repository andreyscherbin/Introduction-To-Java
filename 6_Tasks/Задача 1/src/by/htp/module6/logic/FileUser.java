package by.htp.module6.logic;

import by.htp.module6.entity.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUser {

    public List<User> readFile(String nameFile) throws IOException {

        FileReader fileUsers = new FileReader(nameFile);
        Scanner scan = new Scanner(fileUsers);
        int i = 0;
        List<User> users = new ArrayList<User>();

        while (scan.hasNextLine()) {

            String string = scan.nextLine();
            String[] strings = string.split("/");
            String name, password, email;
            boolean isElectronic;
            name = strings[0];
            password = strings[1];
            email = strings[2];
            users.add(new User(name, password, email));
            i++;
        }

        fileUsers.close();
        return users;
    }
}
