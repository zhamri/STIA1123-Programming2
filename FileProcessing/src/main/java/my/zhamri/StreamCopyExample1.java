package my.zhamri;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamCopyExample1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("zhamri1.txt");
        File outputFile = new File("zhamri2.txt");

        try {
            InputStream inputStream = new FileInputStream(inputFile);
            OutputStream outputStream = new FileOutputStream(outputFile);

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

