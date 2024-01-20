// Base class (superclass)
class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method in the superclass
    public void eat() {
        System.out.println(name + " is eating.");
    }

    // Method in the superclass
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    // Additional property specific to Dog
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        // Call the superclass constructor using 'super'
        super(name);
        this.breed = breed;
    }

    // Additional method specific to Dog
    public void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        // Create an instance of the Dog class
        Dog myDog = new Dog("Buddy", "Labrador");

        // Inherited methods from the Animal class
        myDog.eat();   // Calls the eat() method from the superclass
        myDog.sleep(); // Calls the sleep() method from the superclass

        // Methods specific to the Dog class
        myDog.bark();
    }
}
//java doesnot support Multiple inheritance eg 2 parent class and 1 child class