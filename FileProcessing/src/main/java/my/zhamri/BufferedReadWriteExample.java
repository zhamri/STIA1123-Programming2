package my.zhamri;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReadWriteExample {

    public static void main(String[] args) {
        String filePath = "example.txt";

        // Writing to the file using BufferedWriter
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write("First line of text");
            bufferedWriter.newLine();  // Adds a new line
            bufferedWriter.write("Second line of text");
            bufferedWriter.newLine();
            bufferedWriter.write("Third line of text");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading from the file using BufferedReader
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

