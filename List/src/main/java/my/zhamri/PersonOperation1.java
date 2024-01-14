package my.zhamri;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonOperation1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        // Delete a person from the list
        deletePerson(people, "Bob");

        // Edit a person's details in the list
        editPerson(people, "Alice", 32);

        // Print the updated list
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static void deletePerson(List<Person> people, String name) {
        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
                break;
            }
        }
    }

    private static void editPerson(List<Person> people, String name, int newAge) {
        for (Person person : people) {
            if (person.getName().equals(name)) {
                person.setAge(newAge);
                break;
            }
        }
    }
}

