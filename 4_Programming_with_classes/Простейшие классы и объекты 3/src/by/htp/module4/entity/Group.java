package by.htp.module4.entity;

import java.util.ArrayList;
import java.util.List;

public class Group implements Serializable {

    private static final long serialVersionUID = 3L;

    private int groupNumber;
    private List<Student> students;

    {
        students = new ArrayList<>();
    }

    public Group() {
        super();
    }

    public Group(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Group)) {
            return false;
        }

        Group group = (Group) o;

        return group.groupNumber == groupNumber;
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + groupNumber;
        result = 31 * result + ((students == null) ? 0 : students.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Group number: " + groupNumber;
    }
}
