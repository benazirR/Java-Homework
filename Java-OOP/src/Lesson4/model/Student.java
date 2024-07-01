package Lesson4.model;

public class Student extends User {

    private int id;
    private String name;
    private String lastName;

    public Student(){
        id = 0;
        name = "ExampleName";
        lastName = "ExampleLastName";
    }

    public Student(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format("Student [id=%d, name=%s, lastName=%s]", id, name, lastName);
    }
}
