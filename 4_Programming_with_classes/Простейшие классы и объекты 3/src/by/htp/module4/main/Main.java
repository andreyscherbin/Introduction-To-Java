package by.htp.module4.main;

import by.htp.module4_1.entity.Group;
import by.htp.module4_1.entity.Student;
import by.htp.module4_1.logic.GroupLogic;
import by.htp.module4_1.view.GroupView;

import java.util.Arrays;
import java.util.List;

public class Main {

    /*
     * Создайте класс с именем Student, cодержащий поля:фамилия и инициалы, номер группы, успеваемость(массив из пяти
     * элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и номеров
     * групп студентов, имеющих оценки, равные только 9 или 10.
     */
    public static void main(String[] args) {

        GroupLogic groupLogic = new GroupLogic();
        GroupView  groupView =  new GroupView();
        Group group = new Group(1);

        Student student1 = new Student("Orlov","A.B",1);
        Student student2 = new Student("Ivanov", "C.D", 1);
        Student student3 = new Student("Petrov", "E.G", 1);
        Student student4 = new Student("Yrochkin", "G.B", 1);
        Student student5 = new Student("Konchikov", "H.M", 1);
        Student student6 = new Student("Matrosov", "T.T", 1);
        Student student7 = new Student("Anopkin", "Y.Y", 1);
        Student student8 = new Student("Setochkin", "H.Y", 1);
        Student student9 = new Student("Maliwkin", "E.M", 1);
        Student student10 = new Student("Miwa","A.B",1);

        List<Integer> list1= Arrays.asList(9, 9, 9, 9, 10);
        List<Integer> list2 = Arrays.asList(8, 8, 9, 8, 10);
        List<Integer> list3 = Arrays.asList(8, 7, 6, 5, 9);
        List<Integer> list4= Arrays.asList(8, 8, 9, 10, 10);
        List<Integer> list5 = Arrays.asList(8, 9, 10,10,9);
        List<Integer> list6 = Arrays.asList(9, 9, 9, 9, 9);

        student1.setMarks(list1);
        student2.setMarks(list2);
        student3.setMarks(list3);
        student4.setMarks(list4);
        student5.setMarks(list1);
        student6.setMarks(list2);
        student7.setMarks(list3);
        student8.setMarks(list6);
        student9.setMarks(list1);
        student10.setMarks(list1);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);
        group.addStudent(student4);
        group.addStudent(student5);
        group.addStudent(student6);
        group.addStudent(student7);
        group.addStudent(student8);
        group.addStudent(student9);
        group.addStudent(student10);

        groupView.printExcellentStudents(groupLogic.findExcellentGroup(group));

    }
}
