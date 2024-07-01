package Lesson4.controller;

import Lesson4.model.Teacher;
import Lesson4.model.User;
import Lesson4.service.TeacherService;

import java.util.List;

public class TeacherController implements UserController {
    private TeacherService teacherService = new TeacherService();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public <T extends User>Teacher createTeacher(int id, String name, String LName) {
        return teacherService.createTeacher(id, name, LName);
    }

    public <T extends User>Teacher updateTeacher(Teacher teacher, String name, String LName) {
        return teacherService.updateTeacher(teacher, name, LName);
    }

    public <T extends User>void sendOnConsole(Teacher teacher) {
        teacherService.sendOnConsole(teacher);
    }

    public <T extends User>void sendOnConsole(List<Teacher> teachers) {
        teacherService.sendOnConsole(teachers);
    }
}
