// Polymorphism is a fundamental concept in object-oriented programming (OOP) that allows objects of different types to be treated as objects of a common type. It enables flexibility and extensibility in code by allowing a single interface or method name to represent various implementations. There are two types of polymorphism in Java: compile-time (or static) polymorphism and runtime (or dynamic) polymorphism.

// 1. **Compile-time Polymorphism (Method Overloading):**
//    - Compile-time polymorphism is achieved through method overloading.
//    - It involves defining multiple methods with the same name in the same class, but with different parameter lists (different number or types of parameters).
//    - The appropriate method is selected at compile time based on the method signature.

//    ```java
//    public class Calculator {
//        public int add(int a, int b) {
//            return a + b;
//        }

//        public double add(double a, double b) {
//            return a + b;
//        }
//    }
//    ```

//    In this example, there are two `add` methods with different parameter types (`int` and `double`), demonstrating compile-time polymorphism.

// 2. **Runtime Polymorphism (Method Overriding):**
//    - Runtime polymorphism is achieved through method overriding.
//    - It involves defining a method in a subclass that is already present in its superclass.
//    - The appropriate method is selected at runtime based on the actual type of the object.

//    ```java
//    // Base class
//    class Animal {
//        public void makeSound() {
//            System.out.println("Some generic sound");
//        }
//    }

//    // Subclass overriding the makeSound method
//    class Dog extends Animal {
//        @Override
//        public void makeSound() {
//            System.out.println("Woof! Woof!");
//        }
//    }
//    ```

//    In this example, the `Dog` class overrides the `makeSound` method of the `Animal` class, demonstrating runtime polymorphism. The behavior of `makeSound` depends on the actual type of the object.

// 3. **Polymorphism in Action:**
//    - Polymorphism allows for flexibility when working with objects of different types through a common interface.

//    ```java
//    Animal myAnimal = new Dog(); // Creating an object of type Dog but referencing it as an Animal
//    myAnimal.makeSound(); // Calls the makeSound method of the Dog class
//    ```

//    In this example, `myAnimal` is of type `Animal`, but it points to an instance of `Dog`. The `makeSound` method called is the overridden method in the `Dog` class.

// Polymorphism simplifies code design, promotes code reuse, and allows for more generic and flexible programming. It's a key principle in OOP that contributes to the development of robust and extensible software systems.

//DYNAMIC MTHOD DISPATCH --- inheritance is imp here

class A{
    public void show(){
        System.out.println("in A");
    }
}
class B extends A{
    public void  show(){
        System.out.println("in B");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
        obj = new B();
        obj.show();
    }
}
