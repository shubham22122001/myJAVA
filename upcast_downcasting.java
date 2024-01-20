class A{
    public void show1(){
        System.out.println("in A");

    }
}
class B extends A{
    public void show2(){
        System.out.println("in B");
    }
}
public class upcast_downcasting {
    public static void main(String[] args) {
        // A obj = (A) new B(); //UPCASTING
        A obj = new B(); // HEre A is taken as reference so A doesnt have any ide about methods in B so we use dowwncasting to get output
        B obj1 = (B) obj; // DOWNCASTING

        obj1.show2();
    }
}
