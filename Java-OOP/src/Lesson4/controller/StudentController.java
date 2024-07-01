package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.model.User;
import Lesson4.service.StudentService;
import Lesson4.view.StudentView;
import Lesson4.view.UserView;

import java.util.List;

public class StudentController implements UserController {

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    private StudentService studentService = new StudentService();

    public <T extends User> Student CreateStudent(int id, String name, String last) {
        return studentService.createStudent(id, name, last);
    }

    public <T extends User> Student UpdateStudent(Student student, String name, String last) {
        return studentService.updateStudent(student, name, last);
    }

    public <T extends User> void SendToConsole(Student student) {
        studentService.sendOnConsole(student);
    }

    public <T extends User> void SendToConsole(List<Student> studentList) {
        studentService.sendOnConsole(studentList);
    }
}
