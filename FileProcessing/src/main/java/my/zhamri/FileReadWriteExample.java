package my.zhamri;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadWriteExample {

    public static void main(String[] args) {
        String filePath = "zhamri3.txt";
//        String filePath = "/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/example.txt";

        // Write to the file
        try {
            // Creating a File object that represents the disk file.
            File myFile = new File(filePath);

            // Creating FileWriter and PrintWriter objects for writing.
            FileWriter fileWriter = new FileWriter(myFile);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Writing text to the file
            printWriter.println("zFirst line of text");
            printWriter.println("zSecond line of text");
            printWriter.printf("zWe can also write formatted text like numbers: %d", 100);

            // Closing PrintWriter also flushes the stream.
            System.out.println("Writing completed");
            printWriter.close();

            // Reading from the file
            // Creating FileReader and BufferedReader objects for reading.
            FileReader fileReader = new FileReader(myFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Reading text from the file
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            // Closing BufferedReader
            bufferedReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

