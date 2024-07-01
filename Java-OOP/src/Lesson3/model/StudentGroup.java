package Lesson3.model;

import Lesson3.util.StudentGroupIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    public List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addStudents(List<Student> studentsList) {
        students.addAll(studentsList);
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }
}
