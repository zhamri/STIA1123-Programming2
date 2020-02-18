package my.zhamri.stia1123.constructor;

public class ExampleThis3 {

    public ExampleThis3() {
        System.out.println("First Constructor");
    }

    public ExampleThis3(String str) {
        this();
        System.out.println("Second Constructor " + str);
    }

    public static void main(String[] args) {
        ExampleThis3 exampleThis = new ExampleThis3("Hello");
    }
}


/***
 * First Constructor
 * Second Constructor Hello
 */
