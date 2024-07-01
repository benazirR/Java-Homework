package Lesson3.util;

import Lesson3.model.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student stud1, Student stud2) {
        return stud1.id - stud2.id;
    }
}
