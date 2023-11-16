package my.zhamri.stia1123.TheoryAbstraction;

public abstract class FishSpecies extends Animal{
    @Override
    public abstract void eat();

    @Override
    public abstract void breath();

    public void jump(){
        System.out.println("Fish can jump");
    }
}
