package my.zhamri.stia1123.inheritance;

class Vehicle {
    void number_of_wheels() {
        System.out.println("Parent class Method");
    }
}

class Car extends Vehicle {
    void number_of_wheels() {
        System.out.println("4 wheels");
    }
}

class Bike extends Vehicle {

    void number_of_wheels() {
        System.out.println("2 wheels");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.number_of_wheels();
        Bike b = new Bike();
        b.number_of_wheels();

        Vehicle myCar = new Car();
        myCar.number_of_wheels();
        Vehicle myBike = new Bike();
        myBike.number_of_wheels();
    }
}

/*
Questions

1. What is the output?
2. How many OOP concepts have been applied in this example?
3. Explain line 29 and 31.
4. Divide into 4 classes. Then run the program again.
5. Create a Bus class which is the subclass of Vehicle class.
6. Create a ElectricCar class which is the subclass of Car class.

Note: Inheritance-Car.png
 */
