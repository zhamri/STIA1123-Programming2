package my.zhamri.stia1123;

public class MyReferenceVariable1 {

    public static void main(String[] args) {
        // Creating an instance of a class 'car1'
        Car car1 = new Car("Blue");
        System.out.println(car1);

        // 'car' is a reference variable that points to the Car object in memory
        System.out.println(car1.getColor());  // Outputs: Blue

        // Assigning 'car1' to 'car2' reference variable
        Car car2 = car1;

        // Now both 'car1' and 'car2' reference the same Car object
        car2.setColor("Red");
        System.out.println(car1.getColor());  // Outputs: Red since 'car2' and 'car1' point to the same object

        System.out.println(car1);
        System.out.println(car2);

        Car car3 = new Car("Yellow");
        System.out.println(car3.getColor());
        System.out.println(car3);

        car1 = car3;
        System.out.println(car1.getColor());
        System.out.println(car1);
    }
}

class Car {
    private String color;

    public Car(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

/*
OUTPUT

my.zhamri.stia1123.Car@28a418fc
Blue
Red
my.zhamri.stia1123.Car@28a418fc
my.zhamri.stia1123.Car@28a418fc
Yellow
my.zhamri.stia1123.Car@5305068a
Yellow
my.zhamri.stia1123.Car@5305068a
 */

