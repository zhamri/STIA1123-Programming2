package my.zhamri.stia1123.string;

public class Method_toString {

    private String firstName;
    private String lastName;
    private int age;

    public Method_toString(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "firstName=" + firstName + '\n' +
                "lastName=" + lastName + '\n' +
                "age=" + age;
    }

    public static void main(String[] args) {
        Method_toString obj = new Method_toString("Abdul", "Rahman", 31);
        System.out.println(obj);
    }
}

/***
 * firstName=Abdul
 * lastName=Rahman
 * age=31
 */
