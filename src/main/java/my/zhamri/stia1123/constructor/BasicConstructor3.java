package my.zhamri.stia1123.constructor;

public class BasicConstructor3 {

    private int num1;
    private int num2;

    public BasicConstructor3(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void displayNumber() {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    public static void main(String[] args) {
        BasicConstructor3 basicConstructor = new BasicConstructor3(8, 3);
        basicConstructor.displayNumber();
    }
}

/***
 * num1 = 8
 * num2 = 3
 */