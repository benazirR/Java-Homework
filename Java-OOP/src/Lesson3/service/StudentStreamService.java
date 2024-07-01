package Lesson3.service;

import Lesson3.model.StudentGroup;
import Lesson3.model.StudentStream;
import Lesson3.util.StudentStreamComparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentStreamService {
    private StudentStream studentStream;

    public StudentStreamService() {
        studentStream = new StudentStream();
    }

    public void addStudentGroupToStream(StudentGroup studentGroup) {
        studentStream.addStudentGroup(studentGroup);
    }

    public List<StudentStream> sort() {
        Collections.sort(studentStream.getStudentGroupList(), new StudentStreamComparator());
        return studentStream.getStudentGroupList();
    }
}
