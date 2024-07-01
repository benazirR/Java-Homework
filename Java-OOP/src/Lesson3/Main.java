package Lesson3;

import Lesson3.controller.StudentController;
import Lesson3.controller.StudentGroupController;
import Lesson3.controller.StudentSreamController;
import Lesson3.model.Student;
import Lesson3.model.StudentStream;
import Lesson3.service.StudentGroupService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        StudentGroupController sgc = new StudentGroupController();
        StudentGroupController sgc2 = new StudentGroupController();
        StudentGroupController sgc3 = new StudentGroupController();
        StudentGroupController sgc4 = new StudentGroupController();
        StudentSreamController ssc = new StudentSreamController();
        StudentSreamController ssc2 = new StudentSreamController();

        // Создание студентов
        Student ivan = sc.createStudent(1, "Ivan", "Ivanov");
        Student alex = sc.createStudent(1, "Alex", "Alexeev");
        Student andrey = sc.createStudent(1, "Andrey", "Andreev");
        Student jay = sc.createStudent(1, "Jay", "Jayev");
        Student kate = sc.createStudent(1, "Kate", "Kateev");
        Student mary = sc.createStudent(1, "Mary", "Maryev");
        Student sam = sc.createStudent(1, "Sam", "Samev");

        // Добавление студентов в группе
        sgc.addStudents(List.of(ivan, alex, andrey, jay, kate, mary));
        sgc2.addStudents(List.of(ivan, alex, andrey, jay));
        sgc3.addStudents(List.of(ivan, alex, sam));
        sgc4.addStudents(List.of(ivan, alex, andrey, mary, sam));

        // Добавление группы в поток
        ssc.addStudentGroup(sgc.getStudentGroup());
        ssc.addStudentGroup(sgc2.getStudentGroup());
        ssc.addStudentGroup(sgc3.getStudentGroup());
        ssc.addStudentGroup(sgc4.getStudentGroup());

        ssc2.addStudentGroup(sgc.getStudentGroup());
        ssc2.addStudentGroup(sgc4.getStudentGroup());

        // Сортировка групп в потоке
        ssc.sortStudentGroupList();

        // Сортировка потоков по количеству групп в потоке
        ssc.addStudentStreamToDataBase(ssc.getSS());
        ssc.addStudentStreamToDataBase(ssc2.getSS());
        ssc.sortStudentStream();
    }
}
