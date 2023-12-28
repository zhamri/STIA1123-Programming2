package my.zhamri.checkedException;

public class InterruptedExceptionExample {
    public static void main(String[] args) {

//        Thread.sleep(3000);

        try {
            System.out.println("Wait for 3 seconds...");
            // Pauses the program for 3000 milliseconds (3 seconds)
            Thread.sleep(3000);
            // This line will be executed after the 3-second wait
            System.out.println("3 seconds are over!");
        } catch (InterruptedException e) {
            // This block is executed if the sleep is interrupted
            System.err.println("The sleep was interrupted.");
        }
    }
}
