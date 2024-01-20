abstract class Car{
    public abstract void drive();//abstract method is used to declare a method that is u dont mention the behaviour of the method just declare it and it can be define by other child class
    public void playMusic(){
        System.out.println("play music");
    }
    
}
//abstract class must have child where its declared method is override for eg here drive() is there if u change method it will give error
class WagonR extends Car{
    public void drive(){
        System.out.println("Driving");
    }
}

public class abstract1 {
    public static void main(String[] args) {
        // Car obj = new Car();// but but but u cant create an object of an abstract class.
        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
    }
}
