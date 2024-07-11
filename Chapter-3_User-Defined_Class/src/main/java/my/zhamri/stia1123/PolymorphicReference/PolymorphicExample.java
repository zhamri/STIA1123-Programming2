package my.zhamri.stia1123.PolymorphicReference;

// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}

public class PolymorphicExample {
    public static void main(String[] args) {
        // Parent class reference to a child class object
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Calls the overridden method in Dog class
        myDog.makeSound(); // Output: Bark

        // Calls the overridden method in Cat class
        myCat.makeSound(); // Output: Meow
    }
}

