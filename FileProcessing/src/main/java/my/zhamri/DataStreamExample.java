package my.zhamri;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) {
        String filePath = "myData.bin";

        // Write data to a file using DataOutputStream
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            dos.writeInt(123);
            dos.writeDouble(45.67);
            dos.writeBoolean(true);
            dos.writeUTF("Hello, World!");
            dos.writeChar('A');
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read data from the file using DataInputStream
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            int intValue = dis.readInt();
            double doubleValue = dis.readDouble();
            boolean booleanValue = dis.readBoolean();
            String stringValue = dis.readUTF();
            char charValue = dis.readChar();

            System.out.println("Read values: ");
            System.out.println("Int: " + intValue);
            System.out.println("Double: " + doubleValue);
            System.out.println("Boolean: " + booleanValue);
            System.out.println("String: " + stringValue);
            System.out.println("Char: " + charValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

