package my.zhamri.stia1123.string;

public class ExampleAddress {

    private static String student;

    public static void main(String[] args) {

        student = new String("Ani");
        student = new String("Obi");
        System.out.println(Integer.toHexString(System.identityHashCode(student)));

    }
}


/***
 * Result using my Mac:
 *
 * 38af3868
 */