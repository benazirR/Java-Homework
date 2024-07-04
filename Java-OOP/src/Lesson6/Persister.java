package Lesson6;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Persister implements IPersister {
    private User user;

    public Persister(User user) {
        this.user = user;
    }

    @Override
    public void save() {
        try (PrintWriter out = new PrintWriter(new FileWriter("user.txt"))) {
            out.println("Name: " + user.getName());
            out.println("Age: " + user.getAge());
        } catch (IOException e) {
            System.err.println("Error saving user: " + e.getMessage());
        }
    }
}
