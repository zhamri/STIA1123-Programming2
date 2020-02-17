package my.zhamri.stia1123.string;

public class CompareString2 {
    public static void main(String[] args) {
        String x = "Java";
        if (x == "Java") {
            System.out.println("x = Java");
        } else {
            System.out.println("x != Java");
        }

        String y = new String("Programming");
        if (y == "Programming") {
            System.out.println("y = Programming");
        } else {
            System.out.println("y != Programming");
        }

        String z = new String("Sintok");
        if (z.equals("Sintok")) {
            System.out.println("z = Sintok");
        } else {
            System.out.println("z != Sintok");
        }
    }
}

/***
 * x = Java
 * y != Programming
 * z = Sintok
 */
