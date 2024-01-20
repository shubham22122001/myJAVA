// class name {
//     variable 
//     // action
//     public int(type) add {
//         //behaivour
//     }
// }

// U CAN HAVE SAME METHODS IN A CLASS WITH DIFFERENT PARAMENTERS OR TYPE THIS IS CALLED METHOD OVERLOADING
// SAME PARAMETERS CAN CAUSE ERROR WHAT MATERS IS NAME AND TYPE(OF PARAMETER)
class calc{
    // int a; //this is instance variable and this is store in HEAP MEMORY ...ALL THE LOCAL VARIABLE ARE STORED IN  STACK MEMORY
    public int add(int n1, int n2)
    {   
        //n1 and n2 are local variable
        // System.out.println("in add");
        int r =n1 + n2;
        return r;
    }
    public int add(int n1, int n2,int n3)
    {
        // System.out.println("in add");
        return n1 + n2+n3;
    }
     public double add(double n1, int n2)
    {
        // System.out.println("in add");
        return n1 + n2;
    }

}

// class Computer 
// {
//     public void playMusic()  //void is used when u dont expect anything in return from the method
//     {
//         System.out.println("Music Playing...");
//     }
//     public String getAPen(int cost)
//     {   
//         if (cost >=10)
//             return "Pen";
         
//         return "Nothing";
//     }
// }
public class class_obj_methods {
    public static void main(String[] args) {
        // Object Oriented Prog
        // Object - Properties and Behviour
         //obj
        //  class_name var = new class_name()
        int num1=4;
        int num2 = 5;
        calc c =new calc(); //THIS IS NOT AN OBJECT BUT IT IS REFERENCE VAIRABLE and ITS VALUE IS THE ADDRESS FROM THE HEAP MEMORY
        int re=c.add(num1,num2);
        // Computer obj = new Computer();
        // obj.playMusic();
        // String c=obj.getAPen(5);
        // System.out.println(c);
    }
}
