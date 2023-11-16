package my.zhamri.stia1123.TheoryAbstraction;

public class Bird extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("Bird is eating");
    }

    @Override
    public void breath() {
        System.out.println("Bird is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Bird can fly");
    }
}
