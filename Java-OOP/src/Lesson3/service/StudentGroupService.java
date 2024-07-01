package Lesson3.service;

import Lesson3.model.Student;
import Lesson3.model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroupService() {
        this.studentGroup = new StudentGroup();
    }

    public void addStudentToGroup(Student student) {
        studentGroup.addStudent(student);
    }

    public void addStudentsToGroup(List<Student> students) {
        studentGroup.addStudents(students);
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.getStudents());
        return studentGroup.getStudents();
    }

    public StudentGroup getStudentGroup() {
        return studentGroup;
    }
}
