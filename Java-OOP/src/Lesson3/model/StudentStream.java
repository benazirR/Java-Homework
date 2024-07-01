package Lesson3.model;

import Lesson3.util.StudentStreamIterator;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup>, Comparable<StudentStream> {
    // Список УчебныхГрупп и реализующий интерфейс Iterable

    private List<StudentGroup> studentGroupList;

    public void addStudentGroup(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(this);
    }

    @Override
    public int compareTo(StudentStream ss) {
        return this.studentGroupList.size() - ss.studentGroupList.size();
    }
}
