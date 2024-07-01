package Lesson3.service;

import Lesson3.model.StudentGroup;
import Lesson3.model.StudentStream;
import Lesson3.util.StudentGroupComparator;

import java.util.Collections;
import java.util.List;

public class StudentStreamService {
    private StudentStream studentStream;

    public StudentStreamService() {
        studentStream = new StudentStream();
    }

    public void addStudentGroupToStream(StudentGroup studentGroup) {
        studentStream.addStudentGroup(studentGroup);
    }

    public List<StudentGroup> sort() {
        Collections.sort(studentStream.getStudentGroupList(), new StudentGroupComparator());
        return studentStream.getStudentGroupList();
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentStream.getStudentGroupList();
    }
}
