package my.zhamri.stia1123;

import java.io.Serializable;

public class UserName implements Serializable {
//    private static final long serialVersionUID = 1L;

    private String firstName;
    private String lastName;

    public UserName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName;
    }
}

