package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana");
        list.add("Cherry");


        // Delete an item by value
//        list.remove("Cherry"); // Removes the first occurrence of "Cherry"

//        // Delete an item by index
//        list.remove(0); // Removes the item at index 2 (third item in the list)
//
//        // Edit (Update) an item
//        int indexToUpdate = 1; // Index of the item you want to update
//        list.set(indexToUpdate, "Orange"); // Replaces "Banana" with "Orange"
        list.set(1, "Orange"); // Replaces "Banana" with "Orange"

        // Print the updated list
        System.out.println("Updated list: " + list);
    }
}

