import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
//input from the user
public class inp {
    public static void main(String[] args) throws NumberFormatException, IOException {
        // System.out.println("Enter number");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf= new BufferedReader(in);
        // Scanner sc = new Scanner(System.in); //EASY METHOD
        // int num= Integer.parseInt(bf.readLine());
        // int num=sc.nextInt();
        
        // System.out.println(num);
        // bf.close();
        int num=0;
        BufferedReader br = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
             br= new BufferedReader(in);
             num= Integer.parseInt(br.readLine());
            System.out.println(num);

        }
        finally{
             br.close();
        }

    }
}
