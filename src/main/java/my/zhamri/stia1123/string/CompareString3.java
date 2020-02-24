package my.zhamri.stia1123.string;

import java.util.Scanner;

public class CompareString3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = "test";
        System.out.println(x.hashCode());

        System.out.println("Please input a string, x:");
        x = sc.nextLine();
        System.out.println(x.hashCode());

        if (x == "Java") {
            System.out.println("x = Java");
        } else {
            System.out.println("x != Java");
        }
    }
}


/***
 * 3556498
 * Please input a string, x:
 * java
 * 3254818
 * x != Java
 */