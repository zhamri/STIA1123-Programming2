package my.zhamri;

import java.io.*;

public class StreamCopyExample {

    public static void main(String[] args) {
        File inputFile = new File("source.txt");
        File outputFile = new File("destination.txt");

        try (
                InputStream inputStream = new FileInputStream(inputFile);
                OutputStream outputStream = new FileOutputStream(outputFile)
        ) {
            int byteRead;

            // Read one byte at a time and write it to the output file.
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead);
            }

            // Flushing the OutputStream to ensure all data is written out.
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

