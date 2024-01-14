package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class FindLastIndexInList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana"); // Adding "Banana" again for demonstration

        // Element to search for
        String searchElement = "Banana";

        // Find the last index of the element
        int lastIndex = list.lastIndexOf(searchElement);

        // Print the last index
        if (lastIndex != -1) {
            System.out.println("The last index of " + searchElement + " is: " + lastIndex);
        } else {
            System.out.println(searchElement + " is not in the list.");
        }
    }
}

