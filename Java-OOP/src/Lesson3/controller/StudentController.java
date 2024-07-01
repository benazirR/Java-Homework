package Lesson3.controller;

import Lesson3.model.Student;
import Lesson3.service.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public Student createStudent(int id, String name, String lName){
        return service.createStudent(id, name, lName);
    }
}
