package Lesson6;

public class Main {
    public static void main(String[] args) {
        User user = new User("John Doe", 30);
        Persister persister = new Persister(user);
        persister.save();
    }
}
