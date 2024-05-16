package my.zhamri.stia1123;

import java.util.Scanner;

public class FunnyStringNew implements MyInterface{

    private static Scanner scan;
    private String colour;
    private String food;
    private String animal;
    private String name;

    public static void main(String[] args) {
        scan = new Scanner(System.in);
        FunnyStringNew funnyStringNew = new FunnyStringNew();
        funnyStringNew.myInput();
        funnyStringNew.myOutput();
    }

    public void myInput(){
//        System.out.println("Enter your favourite colour: ");
//        colour = scan.nextLine();
//
//        System.out.println("Enter your favourite food: ");
//        food = scan.nextLine();
//
//        System.out.println("Enter your favourite animal: ");
//        animal = scan.nextLine();

        System.out.println("Enter the first name of a friend: ");
        String name = scan.nextLine();
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(2));
//        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(5));
//        System.out.println(name.replace("a", "i"));

    }

    public void myOutput(){
        System.out.println("I had a dream that " + name + " ate a " + colour + " " + animal + " and said it tasted like " + food + " !");
    }
}
