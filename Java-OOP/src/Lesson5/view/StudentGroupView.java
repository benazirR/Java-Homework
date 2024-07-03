package Lesson5.view;

import Lesson5.Model.DB.DataBase;
import Lesson5.Model.StudentGroup;
import Lesson5.Model.impl.Student;
import Lesson5.Model.impl.Teacher;
import Lesson5.controller.StudentController;
import Lesson5.controller.StudentGroupController;
import Lesson5.controller.TeacherController;
import Lesson5.service.TeacherService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentGroupView {

    private StudentGroupController controller = new StudentGroupController();
    private TeacherController teacherController = new TeacherController();
    private StudentController studentController = new StudentController();

    public void Start(){
        boolean isContinue = true;

        while (isContinue){
            System.out.println("--------------- Меню работы с учебными группами ---------------");
            System.out.println("1 - Создать учебную группу");
            System.out.println("2 - Найти учебную группу по id");
            System.out.println("3 - Распечатать информацию о всех учебных группах");
            System.out.println("4 - Выход меню работы с учебными группами");
            System.out.println("5 - Выход из программы.");

            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1 ->
                        createStudentGroup();
                case 2 ->
                        getStudentGroupById();
                case 3 ->
                        getAllStudentGroups();
                case 4 ->
                        isContinue = false;
                case 5 ->
                        System.exit(0);
                default ->
                        System.out.println("Операция не поддерживается");
            }
        }
    }

    private StudentGroup createStudentGroup(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Для создания учебной группы необходимо выбрать Преподавателя по ID а также \nнеобходимо выбрать Id Студентов, которых необходимо добавить в группу");
        System.out.println("Enter Teacher ID: ");
        int teacherId = Integer.parseInt(sc.nextLine().trim());
        System.out.println("Enter Student IDs separated by comma: ");
        String studentsIdsString = sc.nextLine();
        String[] idsArray = studentsIdsString.split(",");

        List<Integer> studentIds = new ArrayList<>();

        for (String id : idsArray) {
            try {
                studentIds.add(Integer.parseInt(id.trim()));
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID format: " + id);
            }
        }

        Teacher teacher = teacherController.getTeacherById(teacherId);

        List<Student> students = new ArrayList<>();
        for (Student student : studentController.getAllStudents()) {
            if (studentIds.contains(student.getId())) {
                students.add(student);
            }
        }

        StudentGroup studentGroup = controller.createStudentGroup(teacher, students);
        return studentGroup;
    }

    private StudentGroup getStudentGroupById(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter StudentGroup Id: ");
        int ID = sc.nextInt();
        StudentGroup group = controller.getStudentGroupById(ID);
        System.out.println(group);
        return group;
    }

    private List<StudentGroup> getAllStudentGroups(){
        List<StudentGroup> studentGroups = controller.getAllStudentGroups();
        System.out.println(studentGroups);
        return studentGroups;
    }
}
