package my.zhamri.stia1123.javaInterface;

public class App {
    public static void main(String[] args) {
        Searchable book = new Book("Introduction to Java", "Zhamri Che Ani");
        Searchable member = new Member("John Rambo", "rambo@gmail.com");

        System.out.println(book.search("Java")); // true
        System.out.println(member.search("John")); // true
        System.out.println(member.search("zhamri")); // true

    }
}
