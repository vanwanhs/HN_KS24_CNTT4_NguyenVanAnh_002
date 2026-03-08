package session1.lesson6;

public class User {

    private String name;
    private int age;

    public User(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {

        if (age < 0) {
            throw new InvalidAgeException("Tuổi không thể âm!");
        }

        this.age = age;
    }

    public void printUser() {

        // Defensive programming
        if (name != null) {
            System.out.println("User name: " + name);
        } else {
            System.out.println("User name is not available.");
        }

        System.out.println("Age: " + age);
    }
}