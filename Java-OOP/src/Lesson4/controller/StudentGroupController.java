package Lesson4.controller;

import Lesson4.model.Student;
import Lesson4.service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService service;

    public StudentGroupController(StudentGroupService service) {
        this.service = service;
    }

    public void addStudent(Student student) {
        service.addStudent(student);
    }

}
