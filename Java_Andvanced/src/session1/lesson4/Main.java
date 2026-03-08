package session1.lesson4;
import java.io.IOException;

public class Main{
    public static void saveToFile() throws IOException {
        System.out.println("Saving user data to file...");
        throw new IOException("File writing failed!");
    }

    public static void processUserData() throws IOException {
        System.out.println("Processing user data...");
        saveToFile();
    }
    public static void main(String[] args) {

        try {
            processUserData();
        }
        catch (IOException e) {
            System.out.println("Error handled in main: " + e.getMessage());
        }

        System.out.println("Program continues running...");
    }
}