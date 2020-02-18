package my.zhamri.stia1123.constructor;

public class ExampleThis2 {

    String name;

    public ExampleThis2() {
        this(methodName());
    }

    public ExampleThis2(String name) {
        this.name = name;
    }

    static String methodName() {
        return "Mr. Java";
    }

    public static void main(String[] args) {
        ExampleThis2 exampleThis = new ExampleThis2();
        System.out.println(exampleThis.name);
    }
}

/***
 * Mr. Java
 */
