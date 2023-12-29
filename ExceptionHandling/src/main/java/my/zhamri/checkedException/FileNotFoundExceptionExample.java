package my.zhamri.checkedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {
    public static void main(String[] args) {
        System.out.println("ini adalah main");
        try {
            abc();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static void abc() throws FileNotFoundException {
        System.out.println("ini adalah abc");
        def();
    }

    static void def() throws FileNotFoundException {
        System.out.println("ini adalah def");
        File file = new File("somefile.txt");
        FileReader fr = new FileReader(file);
    }
}



//        try {
//            // Attempt to open a file
//            File file = new File("somefile.txt");
//            FileReader fr = new FileReader(file);
//            // Perform operations with the file
//        } catch (FileNotFoundException e) {
//            // Handle the situation when the file is not found
//            System.out.println("File not found: " + e.getMessage());
//        } finally {
//            // Optional finally block for cleanup activities
//        }
