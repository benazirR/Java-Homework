package Lesson3.controller;

import Lesson3.model.StudentGroup;
import Lesson3.service.StudentStreamService;

import java.util.List;

public class StudentSreamController {
    private StudentStreamService studentStreamService;

    public StudentSreamController() {
        this.studentStreamService = new StudentStreamService();
    }

    public List<StudentGroup> getStudentStream() {
        return studentStreamService.getStudentGroupList();
    }

    public void addStudentGroup(StudentGroup studentGroup) {
        studentStreamService.addStudentGroupToStream(studentGroup);
    }

    public void sortStudentGroupList(){
        studentStreamService.sort();
    }
}
