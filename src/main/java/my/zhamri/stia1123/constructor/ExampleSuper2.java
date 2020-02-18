package my.zhamri.stia1123.constructor;

class Car {

    public Car() {
        System.out.println("Car");
    }

    public Car(String str) {
        System.out.println(str + " Car");
    }
}

class Honda extends Car {

    public Honda() {
        super("Super");
        System.out.println("Honda");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
    }
}


/***
 * Super Car
 * Honda
 */