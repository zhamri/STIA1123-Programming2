package my.zhamri.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {

//        File file = new File("somefile.txt");
//        FileReader fr = new FileReader(file);

        try {
            // Attempt to open a file
            File file = new File("somefile.txt");
            FileReader fr = new FileReader(file);
            // Perform operations with the file
        } catch (FileNotFoundException e) {
            // Handle the situation when the file is not found
            System.out.println("File not found: " + e.getMessage());
        } finally {
            // Optional finally block for cleanup activities
        }
    }
}
