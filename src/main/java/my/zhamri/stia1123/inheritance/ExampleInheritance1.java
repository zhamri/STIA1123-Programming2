package my.zhamri.stia1123.inheritance;

class Person {

    public void displayName() {
        System.out.println("I am person");
    }
}

class Student extends Person {

    public static void main(String[] args) {
        Student student = new Student();
        student.displayName();
    }
}


/***
 * I am person
 */
