/***
 * Example with super.printColor();
 */

package my.zhamri.stia1123.polymorphism;

class SuperCar {

    public void printColor() {
        System.out.println("SuperCar: Red");
    }
}

class SuperToyota extends SuperCar {

    @Override
    public void printColor() {
        super.printColor();   // see here
        System.out.println("SuperToyota: Blue");
    }

    public static void main(String[] args) {
        SuperToyota superToyota = new SuperToyota();
        superToyota.printColor();
    }
}


/***
 SuperCar: Red
 SuperToyota: Blue
 */
