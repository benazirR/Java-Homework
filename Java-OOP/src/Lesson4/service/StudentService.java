package Lesson4.service;

import Lesson4.model.Student;
import Lesson4.view.StudentView;
import Lesson4.view.UserView;

import java.util.List;

public class StudentService {

    private UserView<Student> view = new StudentView();
    private Student student;

    public StudentService() {
        student = new Student();
    }

    public Student createStudent(int id, String name, String last) {

        return new Student(id, name, last);
    }

    public Student updateStudent(Student studentT, String name, String last) {
        return new Student(studentT.getId(), name, last);
    }

    public void sendOnConsole(Student student) {
        view.sendOnConsole(student);
    }

    public void sendOnConsole(List<Student> students) {
        view.sendOnConsole(students);
    }
}
