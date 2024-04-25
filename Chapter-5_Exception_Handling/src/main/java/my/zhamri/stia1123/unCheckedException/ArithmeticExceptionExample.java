package my.zhamri.stia1123.unCheckedException;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        try {
            int z = x / y;
            System.out.println("Nilai Z = " + z);

        } catch (ArithmeticException e) {
            System.out.println("Ini error 1");
        } catch (Exception e) {
            System.out.println("Ini error 2");
        } finally {
            System.out.println("tamat");
        }
    }
}
