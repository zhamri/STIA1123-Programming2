package my.zhamri.stia1123;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class ReadObjectNamesFromFile {
    public static void main(String[] args) {
        String fileName = "/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/Chapter-7_File_Processing/object_names.txt";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<UserName> names = (List<UserName>) ois.readObject();
            System.out.println("Names read from file:");
            for (UserName name : names) {
                System.out.println(name);
                System.out.println();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }
}

