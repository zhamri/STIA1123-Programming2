package my.zhamri.stia1123._throws;

// Import the FileNotFoundException class from the java.io package
import java.io.FileNotFoundException;
import java.io.FileReader;

// Define a class named ThrowsExample
class ThrowsExample {

    // Define a method named readTextFile that throws a FileNotFoundException
    public void readTextFile() throws FileNotFoundException {
        // Attempt to create a FileReader object to read from a file named "File1.txt"
        // This operation can throw a FileNotFoundException if the file does not exist
        FileReader file = new FileReader("File1.txt");
    }

    // Define a method named readFile that also throws FileNotFoundException
    public void readFile() throws FileNotFoundException {
        // Call the readTextFile method which might throw a FileNotFoundException
        readTextFile();
    }

    public static void main(String[] args) {
        // Create an instance of ThrowsExample
        ThrowsExample throwsExample = new ThrowsExample();
        try {
            // Try to call the readFile method, which may throw a FileNotFoundException
            throwsExample.readFile();
        } catch (FileNotFoundException e) { // Catch the FileNotFoundException if it is thrown
            // Print an error message to the console if the file is not found
            System.out.println("Error: File not found");
        }
    }
}

/*
OUTPUT

Error: File not found
 */