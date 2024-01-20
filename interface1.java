// interface is not a class
// In Java, an interface is a reference type that is similar to a class. It is a collection of abstract methods. When a class implements an interface, it inherits the abstract methods declared in the interface.


//class - class --> extends
//class - interface --> implements
//interface - interface --> extends
// interface A{
//     int age=44; //variable in interface are final and static
//     String area="Mumbai";
//      void show();
//      void config();
// }
// interface X{
//     void run();
// }
// interface Y extends X{

// }
// class B implements A,X //class can implement multiple interfaces but not in abstract class 
// {

//     public void show() {

//         System.out.println("in shoow");
//     }

//     public void config() {

//         System.out.println("in config");


// }
//     public void run(){
//         System.out.println("Run..");
//     }
// }
interface Comp{
    void code();
}
class Lap implements Comp{
    public void code(){
        System.out.println("Code, Compile, Run");
    }
}
class Desktop implements Comp{
    public void code(){
        System.out.println("Run, Compile, Run - Faster");
    }
}
class Dev{
    public void devApp(Comp lap){
        lap.code();
    }
}
public class interface1 {
    public static void main(String[] args) {
        // A obj;
        // obj= new B();
        // obj.config();
        // obj.show();
        // X obj1;
        // obj1=new B();
        // obj1.run();
        // System.out.println(A.area);
        Comp lap = new Lap();//interface reference
        Comp desk = new Desktop();
        Dev shubham = new Dev();
        shubham.devApp(desk);

    }


}
