package my.zhamri.stia1123.tutorial.array_of_object;

class PersonList {
    private Person[] person;
    private int counter;

    public PersonList(int size) {
        person = new Person[size];
        counter = 0;
    }

    public void addRecord(Person pers) {
        person[counter] = pers;
        counter++;
    }

    public void displayRecord() {
        for (int i = 0; i < counter; i++) {
            System.out.println("\nName =" + person[i].getName());
            System.out.println("Age = " + person[i].getAge());
            System.out.println("Gender = " + person[i].getGender());
        }
    }

} // end PersonList

