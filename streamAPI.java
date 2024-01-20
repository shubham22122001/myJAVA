import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        List<Integer> nums= Arrays.asList(4,5,7,3,2,6);
        // Stream<Integer> s1=nums.stream(); //once u used this stream u cant reuse this.Benefit of stream is that it provides multple methods.
        // Stream<Integer> s2=s1.filter(n -> n%2==0);
        // Stream<Integer> s3=s2.map(n -> n*2);
        // int res= s3.reduce(0, (c,e)->c+e);//reduce gives a single value as a result its not a stream.
        int res= nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0, (c,e)->c+e);
        System.out.println(res);

        // s3.forEach(n -> System.out.println(n)); //forEach is used to print elments just like nnormal and enhanced for loop



        // int sum=0;
        // for(int n: nums){  //Enhanced for loop
        //     if (n%2==0){
        //         n=n*2;
        //         sum=sum+n;
        //     }
        // }
        // System.out.println(sum);
    }
}
