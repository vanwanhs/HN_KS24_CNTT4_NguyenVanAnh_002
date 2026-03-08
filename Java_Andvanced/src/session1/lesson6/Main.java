package session1.lesson6;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        User user = new User("Anh");

        try {

            user.setAge(-5);

            user.printUser();

            FileService.saveToFile();

        }
        catch (InvalidAgeException e) {

            Logger.logError(e.getMessage());

        }
        catch (IOException e) {

            Logger.logError(e.getMessage());

        }

        System.out.println("Program continues running...");
    }
}