package my.zhamri;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PersonOperation {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Delete a person from the list
        people.remove(new Person("Bob", 25)); // Removes the first occurrence of a Person named "Bob"

        people.remove(1); // Removes the second item in the list
//
//        // Edit a person's details in the list
        people.set(0, new Person("Zhamri", 21));

        // Print the updated list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

