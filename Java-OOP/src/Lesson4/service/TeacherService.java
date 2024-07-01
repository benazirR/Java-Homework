package Lesson4.service;

import Lesson4.model.Teacher;
import Lesson4.view.TeacherView;
import Lesson4.view.UserView;

import java.util.List;

public class TeacherService {
    UserView<Teacher> teacherView = new TeacherView();

    public TeacherService() {

    }

    public Teacher createTeacher(int id, String name, String LName) {
        return new Teacher(id, name, LName);
    }

    public Teacher updateTeacher(Teacher teacher, String name, String LName) {
        return new Teacher(teacher.getId(), name, LName);
    }

    public void sendOnConsole(Teacher teacher) {
        teacherView.sendOnConsole(teacher);
    }

    public void sendOnConsole(List<Teacher> teachers) {
        teacherView.sendOnConsole(teachers);
    }
}
