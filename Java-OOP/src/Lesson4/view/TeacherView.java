package Lesson4.view;

import Lesson4.model.Teacher;

import java.util.Collections;
import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }

    @Override
    public void sendOnConsole(Teacher user) {
        System.out.println(user);
    }

}
