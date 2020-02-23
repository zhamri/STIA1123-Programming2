package my.zhamri.stia1123.hashcode;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Ali");
        Person person2 = new Person("Ali");
        System.out.println(person1);
        System.out.println(person1.hashCode());
        System.out.println(person2);
        System.out.println(person2.hashCode());
        System.out.println(person1 == person2);
        System.out.println(person1.equals(person2));

        System.out.println();
        String x = new String("John");
        String y = new String("John");
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(x == y);
        System.out.println(x.equals(y));

    }
}


/***
 * my.zhamri.stia1123.hashcode.Person@38af3868
 * 951007336
 * my.zhamri.stia1123.hashcode.Person@77459877
 * 2001049719
 * false
 * false
 *
 * 2314539
 * 2314539
 * false
 * true
 */