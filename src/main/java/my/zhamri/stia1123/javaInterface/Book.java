package my.zhamri.stia1123.javaInterface;

public class Book implements Searchable {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean search(String query) {
        return title.contains(query) || author.contains(query);

    }
}

