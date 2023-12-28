package my.zhamri.stia1123.TheoryAbstraction;

public class Fish  extends FishSpecies implements Swimable{

//    public String name = "Zhamri fish";
    public Fish() {
        super();
        System.out.println("Fish Species");
    }

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
        super.displayName();
    }

//    public int methpd1 (int x, int y){
//        return 0;
//    }

//    public String methpd1 (int x, int y){
//        return "abc";
//    }

//    @Override
//    public String toString() {
//        return "Zhamri Fish Example {" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
