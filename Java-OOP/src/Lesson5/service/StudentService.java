package Lesson5.service;

import Lesson5.Model.DB.DataBase;
import Lesson5.Model.impl.Student;

import java.util.List;

public class StudentService {
    public Student createStudent(String firstName, String lastName, int groupId){
        int id;
        int size = DataBase.studentsDB.size();
        if (size == 0){
            id = 1;
        }
        else {
            id = size + 1;
        }
        Student student = new Student(id, firstName, lastName, groupId);
        DataBase.studentsDB.add(student);
        return student;
    }

    public Student getStudentById(int id) throws Exception {
        Student student = DataBase.studentsDB
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);

        if (student == null){
            throw new Exception("Студент не найден");
        }

        return student;
    }

    public List<Student> getAllStudents(){
        return DataBase.studentsDB;
    }
}
