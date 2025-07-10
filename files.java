import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class files 
{
public static void main(String args[])
{
try 
{
    File obj = new File("first.txt");
   if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
    FileWriter Writer = new FileWriter("first.txt");
    Writer.write("Java offers a robust suite of classes and methods for interacting with the file system. These capabilities are fundamental for applications needing to store or retrieve data from files.");
    Writer.close();
    System.out.println("file writing done");
    Scanner sc = new Scanner(obj);
    System.out.println("reading from file:");
    while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    sc.close();
    System.out.println("file reading done");
}catch (IOException e) {
    System.out.println("An error occurred.");
            e.printStackTrace();
}
}
}

