package Lesson5.Model.impl;

import Lesson5.Model.User;

public class Student extends User {
    int groupId;

    public Student(int id, String firstName, String lastName, int groupId) {
        super(id, firstName, lastName);
        this.groupId = groupId;
    }
}
