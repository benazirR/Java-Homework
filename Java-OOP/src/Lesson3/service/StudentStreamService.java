package Lesson3.service;

import Lesson3.model.StudentGroup;
import Lesson3.model.StudentStream;
import Lesson3.model.StudentStreamData;
import Lesson3.util.StudentGroupComparator;
import Lesson3.util.StudentStreamComparator;

import java.util.Collections;
import java.util.List;

public class StudentStreamService {
    private StudentStream studentStream;
    private StudentStreamData studentStreamData;

    public StudentStreamService() {
        studentStreamData = new StudentStreamData();
        studentStream = new StudentStream();
    }

    public void addStudentStreamToData(StudentStream studentStream) {
        studentStreamData.addStudentStream(studentStream);
    }

    public void addStudentGroupToStream(StudentGroup studentGroup) {
        studentStream.addStudentGroup(studentGroup);
    }

    public List<StudentGroup> sort() {
        Collections.sort(studentStream.getStudentGroupList(), new StudentGroupComparator());
        return studentStream.getStudentGroupList();
    }

    public List<StudentStream> sortStudentStream(){
        Collections.sort(studentStreamData.getStudentStreams(),new StudentStreamComparator());
        return studentStreamData.getStudentStreams();
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentStream.getStudentGroupList();
    }

    public StudentStream getStudentStream() {
        return studentStream;
    }
}
