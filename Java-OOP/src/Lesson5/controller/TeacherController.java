package Lesson5.controller;

import Lesson5.Model.impl.Teacher;
import Lesson5.service.TeacherService;

import java.util.List;

public class TeacherController {
    private TeacherService teacherService;

    public TeacherController() {
        this.teacherService = new TeacherService();
    }

    public Teacher createTeacher(String fName, String lName){
        return teacherService.createTeacher(fName, lName);
    }

    public Teacher getTeacherById(int id){
        Teacher teacher = null;
        try{
            teacher = teacherService.getTeacherById(id);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return teacher;
    }

    public List<Teacher> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

}
