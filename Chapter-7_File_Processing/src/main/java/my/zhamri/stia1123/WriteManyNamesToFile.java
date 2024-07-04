package my.zhamri.stia1123;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteManyNamesToFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName = "/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/Chapter-7_File_Processing/names.txt";

        System.out.print("Enter the number of names you want to input: ");
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileName));
            for (int i = 0; i < numberOfNames; i++) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();

                writer.write("First Name: " + firstName);
                writer.newLine();
                writer.write("Last Name: " + lastName);
                writer.newLine();
                writer.newLine(); // Add an extra newline for better readability
            }
            writer.flush(); // Ensure all data is written to the file
            System.out.println("Names written to file: " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        } finally {
            if (writer != null) {
                try {
                    writer.close(); // Close the writer to release resources
                } catch (IOException e) {
                    System.err.println("An error occurred while closing the writer: " + e.getMessage());
                }
            }
            scanner.close();
        }
    }
}

