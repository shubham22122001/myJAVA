class Mobile 
{
    
    // intance variable
    String brand;
    int price;
    //if  i want name variable common to all the objects of class static is used and if we change the value of static vairable , change will be reflected on all the objects...static variable is shared by all the objects..static variable should be call by their class name not obj name..static belongs to CLASS.
    static String name;

    // class loading happens first so static method is called first then the constructor..There is a static block within the Mobile class. Static blocks are used to initialize static variables. In this case, it sets the static variable name to "Phone" and prints a message.
    // static{
    //     name="Phone";
    //     System.out.println("in static block");
    // }
    // //CONSTRUCTOR...constructor (public Mobile()) which initializes the instance variables brand and price
    // public Mobile()
    // {
    //     brand="";
    //     price=200;
    //     // name="Phone";/
    //     System.out.println("in constructor");

    // }
    public void show()
    {
        System.out.println(brand+": "+price+": "+name);
    }
    // STATIC METHOD - this can be called by class name and in non static variable cant be used directly  but 
    public static void show1(Mobile obj)
    {
        // System.out.println("in static method");
        System.out.println(obj.brand+": "+obj.price+": "+name);

    }
}


public class static1 {
    //In Java, the main method is required to be declared as static because it is the entry point of the program, and it needs to be invoked by the Java Virtual Machine (JVM) without creating an instance of the class. The static keyword means that the method belongs to the class itself rather than to instances of the class.
    public static void main(String[] args) throws ClassNotFoundException {

        //if u dont create a obj class wont be loaded but Class.forName can be used to load the class
        // Class.forName("Mobile");
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        Mobile.name="SmartPhone";

        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1400;
        Mobile.name="SmartPhone";

        // Mobile.name="Phone"; // in the output all the name will be now SmartPhone --> Phone

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);
    }
}
