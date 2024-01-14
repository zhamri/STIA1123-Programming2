package my.zhamri;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class RandomNumberList {
    public static void main(String[] args) {
        Random rand = new Random(); // Create Random object
        List<Integer> numbers = new ArrayList<>(); // Create a list to hold integers

        // Generate a random integer and add it to the list
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(100); // Random number between 0 and 99
            numbers.add(randomNumber);
        }

        // Print the list
        System.out.println("List of random numbers: " + numbers);
    }
}

