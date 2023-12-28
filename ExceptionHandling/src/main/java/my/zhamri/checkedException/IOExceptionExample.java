package my.zhamri.checkedException;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionExample {
    public static void main(String[] args) {

//        FileReader fileReader = new FileReader("example.txt");

        try {
            // Attempt to open a file named "example.txt"
            FileReader fileReader = new FileReader("example.txt");
            // add your code here
            fileReader.close(); // Close the file after use
        } catch (IOException e) {
            // This block handles the IOException
            System.out.println("An error occurred while opening the file.");
        }
    }
}
