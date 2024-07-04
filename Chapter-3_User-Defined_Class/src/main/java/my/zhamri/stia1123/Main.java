package my.zhamri.stia1123;

public class Main {
    public static void main(String[] args) {
        Book[] bookArray = new Book[2];
        bookArray[0] = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        bookArray[1] = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        for (int i = 0; i < bookArray.length; i++) {
            System.out.println("Title: " + bookArray[i].getTitle());
            System.out.println("Author: " + bookArray[i].getAuthor());
            System.out.println("Year Published: " + bookArray[i].getYearPublished());
        }

            for (Book book: bookArray) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year Published: " + book.getYearPublished());
        }
    }
}
