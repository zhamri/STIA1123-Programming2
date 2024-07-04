package my.zhamri.stia1123;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class WriteObjectNamesToFile {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fileName = "/Users/zhamri/Documents/JavaProjects/STIA1123-Programming2/Chapter-7_File_Processing/object_names.txt";

            System.out.print("Enter the number of names you want to input: ");
            int numberOfNames = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            List<UserName> names = new ArrayList<>();
            for (int i = 0; i < numberOfNames; i++) {
                System.out.print("Enter first name: ");
                String firstName = scanner.nextLine();

                System.out.print("Enter last name: ");
                String lastName = scanner.nextLine();

                names.add(new UserName(firstName, lastName));
            }

            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
                oos.writeObject(names);
                System.out.println("Names written to file: " + fileName);
            } catch (IOException e) {
                System.err.println("An error occurred while writing to the file: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }

