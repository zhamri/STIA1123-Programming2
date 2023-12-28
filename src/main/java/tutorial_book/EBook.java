package tutorial_book;

public class EBook extends Book implements Downloadable, Information{

    private String eisbn;
    private String format;
    private String size;

    public EBook(String eisbn, String format, String size) {
        this.eisbn = eisbn;
        this.format = format;
        this.size = size;
    }


    public String getEisbn() {
        return eisbn;
    }

    public void setEisbn(String eisbn) {
        this.eisbn = eisbn;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getSize() {
        return size + 100;

    }

    public void setSize(String size) {
        this.size = size;

    }

    @Override
    public void downloadFile() {
        System.out.println("The file has been downloaded to machine");
    }

    @Override
    public void printInformation() {
        System.out.println("EISBN: " + getEisbn());
        System.out.println("Format: " + getFormat());
        System.out.println("Size: " + getSize());
    }

    @Override
    public double calculatePrice(int quantity, double price) {
        double totalPrice = (quantity * price) * 0.2;
        return totalPrice;
    }
}
