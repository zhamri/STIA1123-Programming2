package my.zhamri.stia1123.method;

public class StaticMethod {

    public static void myMethod1() {
        System.out.println("myMethod1");
        myMethod2();
    }

    public static void myMethod2() {
        System.out.println("myMethod2");
    }

    public static void main(String[] args) {
        myMethod1();
    }
}


/***
 * myMethod1
 * myMethod2
 */