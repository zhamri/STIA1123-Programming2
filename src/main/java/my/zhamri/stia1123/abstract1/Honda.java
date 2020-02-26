package my.zhamri.stia1123.abstract1;

public class Honda extends Car {

    public void displayYear() {
        System.out.println("Honda: displayYear");
    }

    public void displayModel() {
        System.out.println("Honda: displayModel");
    }

    public void displayPrice() {
        System.out.println("Honda: displayPrice");
    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.displayYear();
        honda.displayModel();
        honda.displayPrice();
    }
}

/***
 * Honda: displayYear
 * Honda: displayModel
 * Honda: displayPrice
 */
