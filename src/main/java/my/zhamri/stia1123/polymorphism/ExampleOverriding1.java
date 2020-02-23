package my.zhamri.stia1123.polymorphism;

class Car {

    public void printColor() {
        System.out.println("Car: Red");
    }
}

class Toyota extends Car {

    @Override
    public void printColor() {
        System.out.println("Toyota: Blue");
    }

    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        toyota.printColor();
    }
}


/***
 * Toyota: Blue
 */
