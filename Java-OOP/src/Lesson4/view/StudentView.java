package Lesson4.view;

import Lesson4.model.Student;

import java.util.List;

public class StudentView implements UserView<Student> {

    @Override
    public void sendOnConsole(List<Student> students) {
        System.out.println(students);
    }

    @Override
    public void sendOnConsole(Student student) {
        System.out.println(student);
    }
}
