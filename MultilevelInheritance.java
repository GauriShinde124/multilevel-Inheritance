class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Parent)
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal walks.");
    }
}

// Derived class (Child)
class Dog extends Mammal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog();
        
        // Calling methods from all levels of inheritance
        myDog.eat();   // Inherited from Animal
        myDog.walk();  // Inherited from Mammal
        myDog.bark();  // Defined in Dog
    }
}
