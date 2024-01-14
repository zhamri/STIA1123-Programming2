package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class PersonListExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Print the list
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

