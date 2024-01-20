// In Java, the `final` keyword is a modifier that can be applied to classes, methods, and variables, indicating that they cannot be further modified or extended. Here's how `final` is used in different contexts:

// 1. **Final Variables:**
//    - When applied to a variable, the `final` keyword indicates that the variable's value cannot be changed after it has been assigned a value.
//    - Final variables are often used to create constants.

//    ```java
//    public class MyClass {
//        final int MAX_VALUE = 100; // A final variable
//    }
//    ```

// 2. **Final Methods:**
//    - When applied to a method, the `final` keyword indicates that the method cannot be overridden by subclasses. Subclasses are not allowed to provide a different implementation.

//    ```java
//    public class BaseClass {
//        final void someMethod() {
//            // Implementation
//        }
//    }

//    public class SubClass extends BaseClass {
//        // Error: Cannot override the final method from BaseClass
//        void someMethod() {
//            // New implementation
//        }
//    }
//    ```

// 3. **Final Classes:**
//    - When applied to a class, the `final` keyword indicates that the class cannot be subclassed. It prevents other classes from extending it.

//    ```java
//    final class FinalClass {
//        // Class implementation
//    }

//    // Error: Cannot inherit from final class FinalClass
//    class SubClass extends FinalClass {
//        // Subclass implementation
//    }
//    ```

//    Making a class final can be useful when you want to ensure that the class's behavior remains consistent and cannot be altered by subclasses.

// 4. **Final Parameters:**
//    - When applied to method parameters, the `final` keyword indicates that the parameter's value cannot be changed within the method.

//    ```java
//    public void process(final int value) {
//        // Error: Cannot assign a value to final variable 'value'
//        value = 10;
//    }
//    ```

//    This can be helpful in situations where you want to ensure that a parameter is not accidentally modified within a method.

// The `final` keyword contributes to code safety, optimization, and design clarity. It indicates that a variable, method, or class has reached its final form and cannot be further modified or extended.

public class fin {
    public static void main(String[] args) {
        
    }
}
