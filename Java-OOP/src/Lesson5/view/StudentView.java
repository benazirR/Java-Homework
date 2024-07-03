package Lesson5.view;

import Lesson5.Model.DB.DataBase;
import Lesson5.Model.impl.Student;
import Lesson5.controller.StudentController;

import java.util.List;
import java.util.Scanner;

public class StudentView {
    private final StudentController controller = new StudentController();

    public void start(){
        boolean isContinue = true;

        while (isContinue){
            System.out.println("--------------- Меню работы со студентами ---------------");
            System.out.println("1 - Создать студента");
            System.out.println("2 - Найти студента по id");
            System.out.println("3 - Распечатать информацию о всех студентах");
            System.out.println("4 - Выход меню работы со студентами");
            System.out.println("5 - Выход из программы");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1 ->
                    createStudent();
                case 2 ->
                    getStudentById();
                case 3 ->
                    getAllStudents();
                case 4 ->
                    isContinue = false;
                case 5 ->
                    System.exit(0);
                default ->
                    System.out.println("Операция не поддерживается");
            }
        }
    }

    private Student createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Student LastName: ");
        String lastName = sc.nextLine();
        System.out.println("Enter GroupID: ");
        int groupId = sc.nextInt();

        Student st = controller.createStudent(name, lastName, groupId);
        System.out.println(st);
        return st;
    }

    private Student getStudentById() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Id: ");
        int ID = sc.nextInt();
        Student st = controller.getStudentById(ID);
        System.out.println(st);
        return st;
    }

    private List<Student> getAllStudents() {
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    }
}
