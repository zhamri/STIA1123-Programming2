package my.zhamri.stia1123;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) {

    Test2 t = new Test2();
    try {
    t.method1();
    } catch (Exception e){
        e.printStackTrace();
    }

    }

    public void method1() throws IOException {
        String firstName = "zhamri";
        String lastName = "che ani";
        String fileName = "/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/Chapter-7_File_Processing/names.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write("First Name: " + firstName);
        writer.newLine();
        writer.write("Last Name: " + lastName);
        System.out.println("Names written to file: " + fileName);
    }
}