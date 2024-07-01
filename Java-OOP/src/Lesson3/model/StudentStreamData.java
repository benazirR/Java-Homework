package Lesson3.model;

import java.util.ArrayList;
import java.util.List;

public class StudentStreamData {
    private List<StudentStream> studentStreams = new ArrayList<StudentStream>();

    public void addStudentStream(StudentStream studentStream) {
        studentStreams.add(studentStream);
    }

    public List<StudentStream> getStudentStreams() {
        return studentStreams;
    }
}
