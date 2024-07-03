package Lesson5.controller;

import Lesson5.service.StudentService;
import Lesson5.Model.impl.Student;

import java.util.List;

public class StudentController {
    private final StudentService studentService;

    public StudentController() {
        this.studentService = new StudentService();
    }

    public Student createStudent(String firstName, String lastName, int groupId) {
        return studentService.createStudent(firstName, lastName, groupId);
    }

    public Student getStudentById(int id){
        Student student = null;
        try{
            student = studentService.getStudentById(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return student;
    }

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
}
