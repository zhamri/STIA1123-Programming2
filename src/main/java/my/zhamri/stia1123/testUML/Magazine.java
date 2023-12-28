package my.zhamri.stia1123.testUML;

public class Magazine extends LibraryItem{
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void printDetails() {
        System.out.println("Issue Number: " + issueNumber);
    }
}
