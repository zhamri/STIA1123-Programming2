package my.zhamri.stia1123;

public abstract class MyCalculation {

    public double calculateSum(double num1, double num2) {
        return num1 + num2;
    }

    public double divideNumbers(int num1, int num2) {
        try {
            double num3 = (double) num1 / num2;
            return num3;
        } catch (Exception e) {
            System.out.println("Error: zhamri. Please check your input");
            return 0;
        }
    }

    public abstract double ZhamriCalculation(int x, int y);
}
