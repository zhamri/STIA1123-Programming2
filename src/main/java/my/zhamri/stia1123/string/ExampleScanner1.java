package my.zhamri.stia1123.string;

import java.util.Scanner;

public class ExampleScanner1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input your name:");
        String x = sc.nextLine();

        System.out.println("Please input your age:");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Please input your address:");
        String z = sc.nextLine();

        System.out.println("Your name: " + x);
        System.out.println("Your age: " + y);
        System.out.println("Your address: " + z);
    }
}

/***
 * Please input your name:
 * Ali
 * Please input your age:
 * 35
 * Please input your address:
 * Jitra
 * Your name: Ali
 * Your age: 35
 * Your address: Jitra
 */