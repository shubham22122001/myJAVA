class Human {
    // Private variables encapsulated within the class
    private int age;
    private String name;

    /**
     * Constructors are special methods in Java classes that are called
     * automatically
     * when an object is created. They are used to initialize the object's state,
     * allocate resources, and perform setup operations. Constructors have the same
     * name as the class and do not have a return type. There are two types of
     * constructors: default (no-argument) constructors and parameterized
     * constructors.
     * Default constructors are provided by Java if none is explicitly defined in
     * the class.
     * Constructors play a crucial role in object initialization and are essential
     * for creating instances with proper initial values.
     */

    //to make constructor its mandatory its name should be same as class name..it will be called no need to call ..evertime obj is created constructor will be called automatically
    // public Human()
    // {
    //     age=12;
    //     name="John";  
    // }
    // public Human(int a,String n) //PArameterized Constructur 
    // {
    //     age=a;
    //     name=n;  
    // }
    
    // right click-->source action-->generate setters and getters (shortcut)
    public int getAge() {
        return age;
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human() {
        age=12;
        name="John"; 
    }

    public void setAge(int age) {
        this.age = age; // this is used as age(local var) and age(instance) has same name..to
                        // differentiate 'this' is used.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class encapsulation {
    public static void main(String[] args) {
        // Encapsulation is one of the four fundamental Object-Oriented Programming
        // (OOP) concepts. It refers to the bundling of data (attributes) and methods
        // (functions) that operate on the data into a single unit known as a class. The
        // internal details of the class are hidden from the outside world, and access
        // to the data is controlled through public methods

        Human obj = new Human();
        Human obj1 = new Human(21,"Shubham");
        // obj.setAge(21);
        // obj.setName("Shubham");
        System.out.println(obj.getName() + ": " + obj.getAge());
        System.out.println(obj1.getName() + ": " + obj1.getAge());


    }
}
