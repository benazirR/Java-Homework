package Lesson5.Model.DB;

import Lesson5.Model.StudentGroup;
import Lesson5.Model.impl.Student;
import Lesson5.Model.impl.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();
    public static final List<Teacher> teachersDB = new ArrayList<>();
    public static final List<StudentGroup> studentGroupsDB = new ArrayList<>();

    public static void feelDB(){
        Teacher teacher = new Teacher(1,"Alex", "Johnson");
        teachersDB.add(teacher);

        Student s1 = new Student(1,"Andrey", "Andreev", 1);
        Student s2 = new Student(2,"Ricon", "Stark", 1);
        Student s3 = new Student(3,"Someone", "Stark", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
        studentsDB.add(s3);

        StudentGroup studentGroup = new StudentGroup();
        teacher.addGroup(studentGroup);
        studentGroup.addTeacherToGroup(teacher);
        studentGroup.addStudentsToGroup(List.of(s1,s2));
        studentGroupsDB.add(studentGroup);

    }
}
