// class A extends Thread
// Different method to create thread
class A implements Runnable

{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}
//run method must be there for thread
// class B extends Thread
class B implements Runnable
{
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("Shubham");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class threads {
    public static void main(String[] args) {
        // A obj1=new A();
        // B obj2 = new B();
        Runnable obj1=new A();
        Runnable obj2 = new B();
        
        // obj1.start();
        // obj2.start();
        Thread t1=new Thread();
        Thread t2 = new Thread();
        t1.start();
        t2.start();
    }
}
