package my.zhamri.stia1123.TheoryAbstraction;

public abstract class Animal {

    protected String name = "Animal name";

    public abstract void eat();
    public abstract void breath();

//    public Animal() {
//        System.out.println("Animal");
//    }

//    public Animal(String name) {
//        this.name = name;
//    }

//    public Animal(){
//
//    }

    public void displayName(){
        System.out.println(this.name);
    }
}
