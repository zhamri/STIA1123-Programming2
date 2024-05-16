package my.zhamri.stia1123;
import java.util.Scanner;

public class FunnyString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your favourite colour: ");
        String colour = scan.nextLine();

        System.out.println("Enter your favourite food: ");
        String food = scan.nextLine();

        System.out.println("Enter your favourite animal: ");
        String animal = scan.nextLine();

        System.out.println("Enter the first name of a friend: ");
        String name = scan.nextLine();

        System.out.println("I had a dream that " + name + " ate a " + colour + " " + animal + " and said it tasted like " + food + " !");

    }
}

