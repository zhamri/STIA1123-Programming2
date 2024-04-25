package my.zhamri.stia1123.unCheckedException;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3};
//        System.out.println(numbers[3]); // This will throw an ArrayIndexOutOfBoundsException

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // This will throw an ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An exception occurred: " + e.getMessage());
        } finally {
            System.out.println("The 'try catch' is finished.");
        }
    }
}
