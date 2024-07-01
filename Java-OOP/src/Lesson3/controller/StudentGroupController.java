package Lesson3.controller;

import Lesson3.model.Student;
import Lesson3.service.StudentGroupService;

public class StudentGroupController {
    private StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    public void addStudent(Student student) {
        studentGroupService.addStudentToGroup(student);
    }
}
