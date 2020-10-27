package by.htp.module4.logic;

import by.htp.module4_1.entity.Group;
import by.htp.module4_1.entity.Student;

import java.util.List;

public class GroupLogic {

    public Group findExcellentGroup(Group group) {

        List<Student> students = group.getStudents();
        Group excelllentGroup = new Group();
        for(Student student : students){
            boolean isExcellentStudent = true;
            List<Integer> marks = student.getMarks();
            for(Integer mark : marks){
                if(mark < 9)
                    isExcellentStudent = false;
            }
            if(isExcellentStudent){
                excelllentGroup.addStudent(student);
            }
        }
        return excelllentGroup;
    }

}
