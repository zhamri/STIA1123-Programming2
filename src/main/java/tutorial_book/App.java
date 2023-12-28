package tutorial_book;

import java.util.Scanner;

public class App {

    private String name = "zhamri";
    public static void main(String[] args) {
        System.out.println("========EBook====================");
        EBook eBook = new EBook("ABC1234567", "pdf", "10MB");
        eBook.downloadFile();
        eBook.printInformation();

        System.out.println("=========Printed Book=============");
        PrintedBook printedBook = new PrintedBook("XYZ1010101", 30.5, "Soft");
        printedBook.printInformation();

        double price = eBook.calculatePrice(10, 30.0);
        System.out.println(price);

    }
}
