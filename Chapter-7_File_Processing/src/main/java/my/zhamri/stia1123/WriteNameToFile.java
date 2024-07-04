package my.zhamri.stia1123;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNameToFile {

    public static void main(String[] args) throws IOException {
        String firstName = "john";
        String lastName = "rambo";
        String fileName = "/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/Chapter-7_File_Processing/names.txt";
//        String fileName = "names.txt";

//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
//            writer.write("First Name: " + firstName);
//            writer.newLine();
//            writer.write("Last Name: " + lastName);
//            System.out.println("Names written to file: " + fileName);
//        } catch (IOException e) {
//            System.err.println("An error occurred while writing to the file: " + e.getMessage());
//        }

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("First Name: " + firstName);
            writer.newLine();
            writer.write("Last Name: " + lastName);
            System.out.println("Names written to file: " + fileName);
    }
}

