package my.zhamri.stia1123.TheoryAbstraction;

public class Duck extends Animal implements Flyable, Swimable{
    @Override
    public void eat() {
        System.out.println("Duck is eating");
    }

    @Override
    public void breath() {
        System.out.println("Duck is breathing");
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
