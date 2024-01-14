package my.zhamri;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformanceComparison {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        // Number of elements to add
        int numberOfElements = 100000;

        // Measure time for ArrayList
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            arrayList.add(0, i); // Adding at the beginning
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList: " + (endTime - startTime) + " ms");

        // Measure time for LinkedList
        startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOfElements; i++) {
            linkedList.add(0, i); // Adding at the beginning
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by LinkedList: " + (endTime - startTime) + " ms");
    }
}

