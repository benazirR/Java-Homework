package Lesson3.util;

import Lesson3.model.StudentGroup;
import Lesson3.model.StudentStream;

import java.util.Iterator;

public class StudentStreamIterator implements Iterator<StudentGroup> {

    private StudentStream studentStream;
    private int index = 0;

    public StudentStreamIterator(StudentStream studentStream) {
        this.studentStream = studentStream;
    }

    @Override
    public boolean hasNext() {
        return index < studentStream.getStudentGroupList().size();
    }

    @Override
    public StudentGroup next() {
        return studentStream.getStudentGroupList().get(index++);
    }
}
