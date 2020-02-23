package my.zhamri.stia1123.polymorphism;

public class ExampleOverloading1 {

    public int addNumbers(int x, int y) {
        return x + y;
    }

    public double addNumbers(double x, int y) {
        return x + y;
    }

    public int addNumbers(int x, int y, int z) {
        return x + y + z;
    }


    public static void main(String[] args) {

        int total1, total2 = 0;
        double total3 = 0.0;

        ExampleOverloading1 exampleOverloading1 = new ExampleOverloading1();
        total1 = exampleOverloading1.addNumbers(5, 9);
        System.out.println(total1);

        total2 = exampleOverloading1.addNumbers(5, 9, 20);
        System.out.println(total2);

        total3 = exampleOverloading1.addNumbers(5.0, 9);
        System.out.println(total3);
    }
}


/***
 * 14
 * 34
 * 14.0
 */