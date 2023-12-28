package my.zhamri.stia1123.tutorial.array_of_object;

import java.util.*;

public class TestPerson {
    public static void main(String[] arg) {
        Scanner read = new Scanner(System.in);
        String name = null;
        Person human;
        int age;
        char gender;
        System.out.println("Enter number of person: ");
        int num = read.nextInt();
        PersonList people = new PersonList(num);
        System.out.println("\n");
        for (int i = 0; i < num; i++) {
            System.out.print("\nEnter name = ");
            name = read.next();
            System.out.print("Enter age = ");
            age = read.nextInt();
            System.out.print("Enter gender = ");
            gender = read.nextLine().charAt(0);
            human = new Person(name, age, gender);
            people.addRecord(human);
        }
        people.displayRecord();
    }
} // end TestPerson
