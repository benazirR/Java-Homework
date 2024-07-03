package Lesson5.Model;

import Lesson5.Model.impl.Teacher;
import Lesson5.Model.impl.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private int id;
    private Teacher teacher;
    private final List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();
        teacher = null;
    }

    public void addTeacherToGroup(Teacher teacher){
        this.teacher = teacher;
    }

    public void addStudentsToGroup(List<Student> students){
        this.students.addAll(students);
    }

    public StudentGroup(int id, Teacher teacher, List<Student> students) {
        this.id = id;
        this.teacher = teacher;
        this.students = students;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "teacher=" + teacher +
                ", students=" + students +
                '}';
    }
}
