package my.zhamri.stia1123.testUML;

public abstract class LibraryItem {
    String title;
    String author;

    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract void printDetails();
}
