package Lesson5.view;

import Lesson5.Model.DB.DataBase;
import Lesson5.Model.impl.Student;
import Lesson5.Model.impl.Teacher;
import Lesson5.controller.TeacherController;

import java.util.List;
import java.util.Scanner;

public class TeacherView {
    private final TeacherController teacherController = new TeacherController();

    public void Start(){
        boolean isContinue = true;

        while (isContinue){
            System.out.println("--------------- Меню работы с учителем ---------------");
            System.out.println("1 - Создать учителя");
            System.out.println("2 - Найти учителя по id");
            System.out.println("3 - Распечатать информацию о всех учителях");
            System.out.println("4 - Выход меню работы с учителями");
            System.out.println("5 - Выход из программы");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1 ->
                        createTeacher();
                case 2 ->
                        getTeacherById();
                case 3 ->
                        getAllTeachers();
                case 4 ->
                        isContinue = false;
                case 5 ->
                        System.exit(0);
                default ->
                        System.out.println("Операция не поддерживается");
            }
        }
    }

    private Teacher createTeacher(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher FirstName: ");
        String name = sc.nextLine();
        System.out.println("Enter Teacher LastName: ");
        String lastName = sc.nextLine();

        Teacher teacher = teacherController.createTeacher(name, lastName);
        System.out.println(teacher);
        return teacher;
    }

    private Teacher getTeacherById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Teacher Id: ");
        int ID = sc.nextInt();
        Teacher teacher = teacherController.getTeacherById(ID);
        System.out.println(teacher);
        return teacher;
    }

    private List<Teacher> getAllTeachers(){
        List<Teacher> teachers = teacherController.getAllTeachers();
        System.out.println(teachers.size());
        return teachers;
    }
}
