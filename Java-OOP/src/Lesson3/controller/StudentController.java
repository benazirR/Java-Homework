package Lesson3.controller;

import Lesson3.service.StudentService;

public class StudentController {
    private StudentService service = new StudentService();

    public void createStudent(int id, String name, String lName){
        service.createStudent(id, name, lName);
    }
}
