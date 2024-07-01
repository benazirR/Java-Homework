package Lesson3.service;

import Lesson3.model.Student;

public class StudentService {

    public Student createStudent(int id, String fName, String lName){
        return new Student(id, fName, lName);
    }
}
