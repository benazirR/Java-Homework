package Lesson5.Model.impl;

import Lesson5.Model.StudentGroup;
import Lesson5.Model.User;
import java.util.List;
import java.util.ArrayList;

public class Teacher extends User {
    private final List<StudentGroup> groups = new ArrayList<>();

    public Teacher(int id, String firstName, String lastName) {
        super(id, firstName, lastName);
    }

    public void addGroup(StudentGroup group) {
        groups.add(group);
    }
}
