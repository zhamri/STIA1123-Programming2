package my.zhamri.stia1123.string;

public class ExampleAddress {

    private static String student;

    public static void main(String[] args) {

        ExampleAddress exampleAddress = new ExampleAddress();
        System.out.println(exampleAddress);

        student = new String("Ani");
        student = new String("Obi");
        System.out.println(Integer.toHexString(System.identityHashCode(student)));

    }
}


/***
 * Result using my Mac:
 *
 * my.zhamri.stia1123.string.ExampleAddress@38af3868
 * 77459877
 */