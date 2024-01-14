package my.zhamri;

public class EditObjectInArray {
    public static void main(String[] args) {
        // Create and initialize an array of Person objects
        Person[] people = new Person[3];
        people[0] = new Person("Alice", 30);
        people[1] = new Person("Bob", 25);
        people[2] = new Person("Charlie", 35);

        // Edit the person at index 1 (Bob)
        int indexToEdit = 1;
        if (indexToEdit >= 0 && indexToEdit < people.length) {
            people[indexToEdit].setName("Robert");
            people[indexToEdit].setAge(26);
        }

        // Print the updated array
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

