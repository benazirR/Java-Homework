package Lesson3.util;

import Lesson3.model.StudentGroup;

import java.util.Comparator;

public class StudentGroupComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getStudents().size() - o2.getStudents().size();
    }
}
