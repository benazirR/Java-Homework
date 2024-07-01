package Lesson4;

import Lesson4.controller.StudentController;
import Lesson4.controller.TeacherController;
import Lesson4.model.Student;
import Lesson4.model.Teacher;

import java.util.List;

public class Lesson4 {

    public static void main(String[] args) {
        StudentController sc = new StudentController();
        sc.SendToConsole(List.of(new Student(1, "Sasha", "Ivanov"),
                        new Student(2, "Ira", "Ivanova")));

        Student student = sc.CreateStudent(3,"Alex", "Alexeev");
        sc.SendToConsole(student);
        student = sc.UpdateStudent(student, "Alexandr", "Alexandrovich");
        sc.SendToConsole(student);

        // Работа с TeacherController
        System.out.println("-----------------------------------------------------");
        TeacherController tc = new TeacherController();
        tc.sendOnConsole(List.of(new Teacher(3, "Alex", "Ivanov"),
                new Teacher(4, "Indira", "Ivanova")));

        Teacher teacher = tc.createTeacher(7, "Andrew", "Elbow");
        tc.sendOnConsole(teacher);
        teacher = tc.updateTeacher(teacher, "Andrey", "Andreev");
        tc.sendOnConsole(teacher);

    }

//    private static List<Student> getStudents() {
//        Student s1 = new Student(1, "Sasha", "Ivanov");
//        Student s2 = new Student(1, "Ira", "Ivanova");
//        return List.of(s1, s2);
//    }
}
