package Lesson5;

import Lesson5.Model.DB.DataBase;
import Lesson5.view.StudentGroupView;
import Lesson5.view.StudentView;
import Lesson5.view.TeacherView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StartApp();
    }

    private static void StartApp(){
        boolean isContinue = true;
        DataBase.feelDB();

        while(isContinue){
            System.out.println("--------------- Основное меню ---------------\nВыбирете действие:");
            System.out.println("1 - Работа со студентами");
            System.out.println("2 - Работа с преподавателями");
            System.out.println("3 - Работа с учебными группами");
            System.out.println("4 - Выход из программы");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1 ->
                        new StudentView().start();
                case 2 ->
                        new TeacherView().Start();
                case 3 ->
                        new StudentGroupView().Start();
                case 5 ->
                        System.exit(0);
                default ->
                        System.out.println("Операция не поддерживается");
            }

        }
    }
}
