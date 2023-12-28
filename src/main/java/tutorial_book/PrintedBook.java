package tutorial_book;

public class PrintedBook extends Book implements Information{

    private String isbn;
    private double weight;

    private String printingType;

    public PrintedBook(String isbn, double weight, String printingType) {
        this.isbn = isbn;
        this.weight = weight;
        this.printingType = printingType;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getPrintingType() {
        return printingType;
    }

    public void setPrintingType(String printingType) {
        this.printingType = printingType;
    }

    @Override
    public void printInformation() {
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Weight: " + getWeight());
        System.out.println("Printing Type: " + getPrintingType());
    }

    @Override
    public double calculatePrice(int quantity, double price) {
        double totalPrice = quantity * price;
        return totalPrice;
    }
}
