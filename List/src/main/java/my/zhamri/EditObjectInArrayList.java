package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class EditObjectInArrayList {
    public static void main(String[] args) {
        // Create and initialize an ArrayList of Person objects
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Edit the person named "Bob"
        for (Person person : people) {
            if ("Bob".equals(person.getName())) {
                person.setName("Robert");
                person.setAge(26);
                break; // Stop the loop after finding and editing the person
            }
        }

        // Print the updated list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

