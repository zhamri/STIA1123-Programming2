package my.zhamri.stia1123.method;

public class ExampleMethod1 {

    public void myMethod1() {
        System.out.println("myMethod1");
        myMethod2();
    }

    public void myMethod2() {
        System.out.println("myMethod2");
    }

    public static void main(String[] args) {
        ExampleMethod1 exampleMethod1 = new ExampleMethod1();
        exampleMethod1.myMethod1();
        exampleMethod1.myMethod2();
    }
}


/***
 * myMethod1
 * myMethod2
 * myMethod2
 */
