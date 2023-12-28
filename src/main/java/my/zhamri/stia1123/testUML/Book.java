package my.zhamri.stia1123.testUML;

public class Book extends LibraryItem implements Reservable{
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        super(title, author);
        this.ISBN = ISBN;
    }

    @Override
    public void reserveItem() {
        System.out.println("Book " + this.title + " reserved");
    }

    @Override
    public void printDetails() {
        System.out.println("Issue Number: " + ISBN);
    }
}
