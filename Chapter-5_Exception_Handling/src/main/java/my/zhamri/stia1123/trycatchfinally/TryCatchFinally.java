package my.zhamri.stia1123.trycatchfinally;

// Define a public class named TryCatchFinally
public class TryCatchFinally {

    public static void main(String[] args) {
        // Print "Start" to indicate the beginning of the program execution
        System.out.println("Start");
        try {
            // Try block begins
            System.out.println("Before x"); // Print before attempting a risky operation
            int x = 7/0; // Attempt to divide by zero, which causes an ArithmeticException
            System.out.println("After x"); // This line will not execute due to the exception above
        } catch (ArithmeticException e){ // Catch block for handling ArithmeticException
            System.out.println("This is ArithmeticException"); // Print if ArithmeticException is caught
        } catch (Exception e){ // Catch block for handling other Exceptions
            System.out.println("This is Exception"); // Print if any other Exception is caught
        } finally {
            // Finally block always executes regardless of whether an exception was thrown or caught
            System.out.println("This is finally"); // Print to indicate the execution of the finally block
        }
        // Print "End" to indicate the end of the program execution
        System.out.println("End");
    }
}

/*
OUTPUT

Start
Before x
This is ArithmeticException
This is finally
End
 */
