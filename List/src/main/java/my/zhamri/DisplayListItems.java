package my.zhamri;

import java.util.ArrayList;
import java.util.List;

public class DisplayListItems {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println(list);

        // Using a simple for-loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        // Using an enhanced for-loop (for-each loop)
//        for (String item : list) {
//            System.out.println(item);
//        }
//
//        // Using Java 8's forEach method with a lambda expression
//        list.forEach(item -> System.out.println(item));
//
//        // Using Java 8's forEach method with a method reference
        list.forEach(System.out::println);
    }
}

