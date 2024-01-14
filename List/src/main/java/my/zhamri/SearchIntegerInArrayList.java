package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class SearchIntegerInArrayList {
    public static void main(String[] args) {
        // Create and initialize an ArrayList with integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        // Integer to search for
        int numberToFind = 30;

        // Check if the list contains the integer
        if (numbers.contains(numberToFind)) {
            System.out.println("Found the number: " + numberToFind);
        } else {
            System.out.println("Number not found");
        }
    }
}

