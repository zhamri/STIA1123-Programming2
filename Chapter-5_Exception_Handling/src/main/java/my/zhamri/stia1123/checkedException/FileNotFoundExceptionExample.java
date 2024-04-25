package my.zhamri.stia1123.checkedException;

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

