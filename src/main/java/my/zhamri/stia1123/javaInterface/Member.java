package my.zhamri.stia1123.javaInterface;

public class Member implements Searchable {
    private String name;
    private String email;

    public Member(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean search(String query) {
        return name.contains(query) || email.contains(query);
    }
}

