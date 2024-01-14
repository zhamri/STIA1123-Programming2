package my.zhamri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class RandomNumberList9 {
    public static void main(String[] args) {
        Random rand = new Random(); // Create Random object
//        int randomNumber1 = rand.nextInt();
//        int randomNumber2 = rand.nextInt(1000);
//        double randomNumber3 = rand.nextDouble(1000);
//
//        System.out.println(randomNumber1);
//        System.out.println(randomNumber2);
//        System.out.println(randomNumber3);

//         List<Integer> myNum = new ArrayList<>();
//         List<Integer> myNum = new LinkedList<>();
//         myNum.add(1);
//         myNum.add(10);
//         myNum.add(1110);
//         myNum.add(6);
//         myNum.add(2.5);
//         myNum.add("uum");
//         myNum.add(new String("zhamri"));

//        System.out.println(myNum);


        List<Integer> numbers = new ArrayList<>(); // Create a list to hold integers

        // Generate a random integer and add it to the list
        for (int i = 0; i < 10; i++) {
            int randomNumber = rand.nextInt(50, 100); // Random number between 0 and 99
            numbers.add(randomNumber);
        }

        // Print the list
        System.out.println("List of random numbers: " + numbers);
    }
}

