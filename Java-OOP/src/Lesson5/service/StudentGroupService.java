package Lesson5.service;

import Lesson5.Model.DB.DataBase;
import Lesson5.Model.StudentGroup;
import Lesson5.Model.impl.Teacher;
import Lesson5.Model.impl.Student;

import java.util.List;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher teacher, List<Student> studentList) {
        int id;
        int size = DataBase.studentGroupsDB.size();
        if (size == 0) {
            id = 1;
        }
        else {
            id = size + 1;
        }

        StudentGroup studentGroup = new StudentGroup(id, teacher, studentList);
        teacher.addGroup(studentGroup);
        DataBase.studentGroupsDB.add(studentGroup);
        return studentGroup;
    }

    public StudentGroup createStudentGroup() {
        StudentGroup studentGroup = new StudentGroup();
        DataBase.studentGroupsDB.add(studentGroup);
        return studentGroup;
    }

    public StudentGroup getStudentGroupById(int id) throws Exception {
        StudentGroup studentGroup = DataBase.studentGroupsDB
                .stream()
                .filter(sg -> sg.getId() == id)
                .findFirst()
                .orElse(null);

        if (studentGroup == null) {
            throw new Exception("Учебная группа не найдена.");
        }

        return studentGroup;
    }

    public List<StudentGroup> getAllStudentGroups() {
        return DataBase.studentGroupsDB;
    }
}
