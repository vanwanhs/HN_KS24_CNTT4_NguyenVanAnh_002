package session1.lesson3;
public class Main {
    public static void main(String[] args) {

        User user = new User();

        user.setAge(20);
        System.out.println("Age: " + user.getAge());
        user.setAge(-5);
    }
}