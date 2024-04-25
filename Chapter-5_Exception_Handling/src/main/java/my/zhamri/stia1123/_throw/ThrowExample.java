package my.zhamri.stia1123._throw;

// Define a class named ThrowExample
class ThrowExample {

    // Define a method named divideOperation that takes two double parameters and returns a double
    public static double divideOperation(double x, double y){
        // Check if the denominator y is zero
        if (y == 0) {
            // Throw an ArithmeticException with a message if y is zero
            throw new ArithmeticException("y cannot be zero");
        }
        // Return the result of dividing x by y
        return x / y;
    }

    public static void main(String[] args) {
        try {
            // Try to perform division and store the result in result1
            double result1 = divideOperation(10, 3);
            // Try to perform division with y as zero and store the result in result2
            double result2 = divideOperation(10, 0);
            // Print result1 to the console
            System.out.println(result1);
            // Print result2 to the console
            System.out.println(result2);
        } catch (Exception e) { // Catch any exceptions that are thrown within the try block
            // Print a message indicating an exception was caught in the main method
            System.out.println("Inside main method");
            // Print a specific message for handling the caught exception
            System.out.println("Main: y cannot be zero");
        }
    }
}

/*
OUTPUT

Inside main method
Main: y cannot be zero
 */