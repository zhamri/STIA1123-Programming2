package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class FindIndexInList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Element to search for
        String searchElement = "Banana";

        // Find the index of the element
        int index = list.indexOf(searchElement);

        // Print the index
        if (index != -1) {
            System.out.println("The index of " + searchElement + " is: " + index);
        } else {
            System.out.println(searchElement + " is not in the list.");
        }
    }
}

