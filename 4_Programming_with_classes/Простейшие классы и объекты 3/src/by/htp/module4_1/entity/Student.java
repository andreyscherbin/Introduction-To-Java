package by.htp.module4_1.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    private String surname;
    private String initials;
    private int groupNumber;
    private List<Integer> marks;

    {
        marks = new ArrayList<Integer>();
    }

    public Student() {
        super();
    }

    public Student(String surname, String initials, int groupNumber) {
        this.surname = surname;
        this.initials = initials;
        this.groupNumber = groupNumber;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }

    public List<Integer> getMarks(){
        return marks;
    }

    public void setMarks(List <Integer> marks){
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Student)) {
            return false;
        }

        Student student = (Student) o;

        return student.surname.equals(surname) &&
                student.initials.equals(initials) &&
                student.groupNumber == groupNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + surname.hashCode();
        result = 31 * result + initials.hashCode();
        result = 31 * result + groupNumber;
        result = 31 * result + ((marks == null) ? 0 : marks.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Surname: " + surname + " Initials: " + initials + " Group number: " + groupNumber;
    }
}
