package Lesson3.controller;

import Lesson3.model.Student;
import Lesson3.model.StudentGroup;
import Lesson3.service.StudentGroupService;

import java.util.List;

public class StudentGroupController {
    private StudentGroupService studentGroupService;

    public StudentGroupController() {
        this.studentGroupService = new StudentGroupService();
    }

    public void addStudent(Student student) {
        studentGroupService.addStudentToGroup(student);
    }

    public void addStudents(List<Student> students) {
        studentGroupService.addStudentsToGroup(students);
    }

    public StudentGroup getStudentGroup(){
        return studentGroupService.getStudentGroup();
    }
}
