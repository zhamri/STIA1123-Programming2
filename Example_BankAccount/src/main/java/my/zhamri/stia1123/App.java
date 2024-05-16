package my.zhamri.stia1123;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int x = 10;
        int y = 5;

        MyCalculation myCalculation = new MySpesificCalculation();
        double z = myCalculation.calculateSum(x, y);
        System.out.println(myCalculation.calculateSum(x, y));
        System.out.println(z);

        System.out.println(myCalculation.divideNumbers(x, y));
        System.out.println(myCalculation.ZhamriCalculation(x,y));
    }
}
