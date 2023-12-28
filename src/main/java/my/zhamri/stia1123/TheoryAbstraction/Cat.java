package my.zhamri.stia1123.TheoryAbstraction;

public class Cat extends Animal{

    private String category;

    public Cat(String category) {
        super();
        this.category = category;
    }

    @Override
    public void eat() {
        System.out.println("Cat can eat");
    }

    @Override
    public void breath() {
        System.out.println("Cat can breath");
    }
}
