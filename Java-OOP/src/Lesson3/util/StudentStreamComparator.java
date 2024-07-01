package Lesson3.util;

import Lesson3.model.StudentGroup;
import Lesson3.model.StudentStream;

import java.util.Comparator;

public class StudentStreamComparator implements Comparator<StudentStream> {
    @Override
    public int compare(StudentStream ss1, StudentStream ss2) {
        return ss1.getStudentGroupList().size() - ss2.getStudentGroupList().size();
    }
}
