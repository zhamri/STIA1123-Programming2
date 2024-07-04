package my.zhamri.stia1123;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        String carMaker1 = "Proton";
        String carMaker2 = "Perodua ";
        String country = "Malaysia";
        String carMaker = carMaker1+" "+ carMaker2.concat(country);
        carMaker2 = carMaker;
        System.out.println(carMaker);
        System.out.println(carMaker1.length()-3);
        System.out.println(carMaker1.indexOf('M'));
        System.out.println(carMaker.substring(11, 20));
        System.out.println(carMaker2.charAt(4));
        System.out.println(country.toUpperCase());

        if (carMaker1.equals(carMaker2)){
            System.out.println("both are equal");
        } else {
            System.out.println("both are not equal");
        }
    }
}
