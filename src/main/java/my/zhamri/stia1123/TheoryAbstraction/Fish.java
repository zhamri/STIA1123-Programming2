package my.zhamri.stia1123.TheoryAbstraction;

public class Fish  extends FishSpecies implements Swimable{
    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public void breath() {
        System.out.println("Fish is breathing thru gills");
    }

    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
}
