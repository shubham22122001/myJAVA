@FunctionalInterface //when this annotation is used the interface should have only one abstract method, more than won will give errpr 
interface A{
    int add(int i,int j);
    // void config();
}
public class annotation {
    public static void main(String[] args) {
        // A obj = new A() {
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };
        //LAMBDA
        // A obj = (i, j) -> System.out.println("in show "+i+", "+j);
        A obj = (i,j) -> i+j;
       
        int r=obj.add(4,5);
        System.out.println(r);
    }
}
