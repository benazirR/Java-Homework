package Lesson5.service;

import Lesson5.Model.DB.DataBase;
import Lesson5.Model.impl.Teacher;

import java.util.List;

public class TeacherService {
    public Teacher createTeacher(String firstName, String lastName) {
        int id;
        int size = DataBase.teachersDB.size();
        if (size == 0){
            id = 1;
        }
        else {
            id = size + 1;
        }

        Teacher teacher = new Teacher(id, firstName, lastName);
        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public Teacher getTeacherById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);

        if (teacher == null){
            throw new Exception("Учитель не найден");
        }

        return teacher;
    }

    public List<Teacher> getAllTeachers() {
        return DataBase.teachersDB;
    }
}
