package Lesson5.controller;

import Lesson5.Model.StudentGroup;
import Lesson5.Model.impl.Student;
import Lesson5.Model.impl.Teacher;
import Lesson5.service.StudentGroupService;

import java.util.List;

public class StudentGroupController {
    private StudentGroupService studentGroupService;

    public StudentGroupController() {
        this.studentGroupService = new StudentGroupService();
    }

    public StudentGroup createStudentGroup() {
        return studentGroupService.createStudentGroup();
    }

    public StudentGroup createStudentGroup(Teacher teacher, List<Student> students) {
        return studentGroupService.createStudentGroup(teacher, students);
    }

    public StudentGroup getStudentGroupById(int id) {
        StudentGroup sg = null;
        try {
            sg = studentGroupService.getStudentGroupById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sg;
    }

    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupService.getAllStudentGroups();
    }
}
