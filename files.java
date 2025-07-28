import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * A simple Java program demonstrating file handling operations:
 * - Creating a file
 * - Writing to a file
 * - Reading from a file
 */
public class FileHandlingExample {

    /**
     * Main method to execute file operations.
     * 
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        try {
            // Create a File object representing "first.txt"
            File obj = new File("first.txt");

            // Attempt to create the file
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write content to the file
            FileWriter writer = new FileWriter("first.txt");
            writer.write("Java offers a robust suite of classes and methods for interacting with the file system. " +
                         "These capabilities are fundamental for applications needing to store or retrieve data from files.");
            writer.close();
            System.out.println("File writing done.");

            // Read content from the file
            Scanner sc = new Scanner(obj);
            System.out.println("Reading from file:");
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            System.out.println("File reading done.");

        } catch (IOException e) {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        }
    }
}
