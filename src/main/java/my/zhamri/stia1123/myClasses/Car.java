package my.zhamri.stia1123.myClasses;

public class Car {
    private String make;
    private String model;
    private int year;
    private String color;
    private int mileage;

//    private int maxSpeed;
//    boolean RightHandDrive;
//    int tyres;
//    int doors;
//    double price;

    public Car(String make, String model, int year, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.mileage = 0;
    }

    // Method to get the car's specification
    public String getSpecification() {
        return year + " " + make + " " + model + ", " + color;
    }

    // Method to display the mileage
    public String displayMileage() {
        return "This car has " + mileage + " miles on it.";
    }

    public static void main(String[] args) {
        Car myCar = new Car("Honda", "Accord", 2022, "white");
        System.out.println(myCar.getSpecification());
        System.out.println(myCar.displayMileage());
    }
}

