// CUSTOM EXCEPTION
class ShubhamException extends Exception{
    public ShubhamException(String string){
        super(string);
    }
}


public class excep {
    public static void main(String[] args) {
        int i=0;
        // int nums[]=new int[5];
        int j=0;
        // String s= null;
        try{
            j=18/i;
            // if (j==0)
                // throw new ArithmeticException("No zero MF");
                //CUSTOM EXCEPTION
                // throw new ShubhamException("No zero MF");
            // System.out.println(s.length());
            // System.out.println(nums[1]);
            // System.out.println(nums[5]);
        }
        // catch(Exception e){
        //     System.out.println("Something went wrong--> "+e);

        // }
        // catch(ArithmeticException e)
        // {
        //     j=18/1;
        //     System.out.println("Default value "+e);
        //     // System.out.println("Cannot divide by zero");
        // }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        // Finally will be used even there is exception r not ..IRRESPECTIVE OF EXCEPTION THIS BLOCK WILL BE EXECUTED...can be use to close the resource.
        finally{
            System.out.println("Bye");
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("Stay in your limit bitch"); 
        // }
        //if have multiple known exceptions and an unknown one ... the exception will come in the end just like in below case..Exception is parent of all types of exceptions...throwable is parent of exception.
        // catch(Exception e){
        //     System.out.println("Something went wrong"+e);
        // }
        // System.out.println(j);
        // System.out.println("Bye");

    }
}
