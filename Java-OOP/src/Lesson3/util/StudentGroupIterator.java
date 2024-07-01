package Lesson3.util;

import Lesson3.model.Student;
import Lesson3.model.StudentGroup;

import java.util.Iterator;

public class StudentGroupIterator  implements Iterator<Student> {
    private StudentGroup studentGroup;
    private int index = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.getStudents().size();
    }

    @Override
    public Student next() {
        return studentGroup.getStudents().get(index++);
    }
}
