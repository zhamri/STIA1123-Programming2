package tutorial_book;

public abstract class Book {
    protected int bookId;
    protected String bookName;
    protected int page;
    protected double price;

    public abstract double calculatePrice(int quantity, double price);
}
