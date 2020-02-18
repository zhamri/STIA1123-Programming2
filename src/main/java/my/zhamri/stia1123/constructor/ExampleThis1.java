package my.zhamri.stia1123.constructor;

public class ExampleThis1 {

    public ExampleThis1() {
        this("Hello");
        System.out.println("First Constructor");
    }

    public ExampleThis1(String str) {
        System.out.println("Second Constructor " + str);
    }

    public static void main(String[] args) {
        ExampleThis1 exampleThis = new ExampleThis1();
    }
}


/***
 * Second Constructor Hello
 * First Constructor
 */