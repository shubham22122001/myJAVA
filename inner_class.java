// class A{
//     int age;
//     public void show(){
//         System.out.println("in show");
//     }
//     class B{
//         public void config(){
//             System.out.println("on config");
//         }
//     }
// }
class A{
    public void show(){
        System.out.println("in show");
    }
}
public class inner_class {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("in new show");//anonynomous inner class too 

            }
        };
        obj.show();
        // A.B obj1= obj.new B(); //for inner cllass
        // obj1.config();
    }
}
