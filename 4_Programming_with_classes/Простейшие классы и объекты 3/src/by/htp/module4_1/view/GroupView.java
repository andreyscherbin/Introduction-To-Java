package by.htp.module4_1.view;

import by.htp.module4_1.entity.Group;
import by.htp.module4_1.entity.Student;

import java.util.List;

public class GroupView {

    public void printExcellentStudents(Group group) {
        List<Student> students = group.getStudents();
        for(Student student : students){
            System.out.println(student);
        }
    }
}
