class A extends Object //superclass
{
    public A()
    {
        super();// this is used in this case as A by default extends Object class 
        System.out.println("in A");
    }
    public A(int n){
        super();
        System.out.println("in A int ");
    }
}
class B extends A{  //subclass of A (B extends A and A extends Object---Inheritance)
    public B(){
        super(); //super here will first call the constructor of super class ..default one as it is not parameterize one
        System.out.println("in B");
    }
    public B(int n){
        // super(n);
        this(); //The this() keyword in Java is used to invoke one constructor from another constructor in the same class. This is known as a constructor chaining. When used, it must be the first statement in the constructor body. 
        System.out.println("in B int ");
    }
}



public class this_super {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}



//In Java, naming conventions are guidelines for naming various elements in your code, such as classes, variables, methods, packages, etc. Consistent naming conventions enhance code readability and maintainability. Here are some common Java naming conventions with examples:

// 1. **Classes and Interfaces:**
//    - Use nouns or noun phrases.
//    - Start with an uppercase letter.
//    - Use camel case (capitalize the first letter of each word, except the first one).

//    ```java
//    // Example:
//    public class Car {
//        // Class members go here
//    }
//    ```

// 2. **Methods:**
//    - Use verbs or verb phrases.
//    - Start with a lowercase letter.
//    - Use camel case.

//    ```java
//    // Example:
//    public void drive() {
//        // Method implementation
//    }
//    ```

// 3. **Variables:**
//    - Use meaningful names.
//    - Start with a lowercase letter.
//    - Use camel case.

//    ```java
//    // Example:
//    int numberOfCars;
//    ```

// 4. **Constants:**
//    - Use uppercase letters with underscores separating words.

//    ```java
//    // Example:
//    public static final int MAX_SPEED = 120;
//    ```

// 5. **Packages:**
//    - Use lowercase letters.
//    - Use a reverse domain name as a prefix for uniqueness.

//    ```java
//    // Example:
//    package com.example.myapp;
//    ```

// 6. **Enums:**
//    - Use uppercase letters.
//    - Use camel case for individual enum constants.

//    ```java
//    // Example:
//    public enum Day {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }
//    ```

// 7. **Parameters:**
//    - Use meaningful names.
//    - Start with a lowercase letter.
//    - Use camel case.

//    ```java
//    // Example:
//    public void printMessage(String message) {
//        // Method implementation
//    }
//    ```

// 8. **Booleans:**
//    - Use names that sound like a yes/no question.
//    - Start with "is," "has," "can," etc.

//    ```java
//    // Example:
//    boolean isReady;
//    ```

// Remember, these are conventions, not strict rules. The most crucial aspect is consistency within your codebase. Adhering to common conventions makes it easier for others to understand and collaborate on your code.