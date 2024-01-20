import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class collection1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
    //    Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();
        // Set<Integer> nums = new HashSet<Integer>(); //onlu unique values here and sequence is not followed.
        //SORTED values in SET
        // Set<Integer> nums = new TreeSet<Integer>(); 


        // nums.add(9);
        // nums.add(5);
        // nums.add(6);
        // nums.add(6);

        // // System.out.println(nums.get(1));
        // // System.out.println(nums.indexOf(5));

        // // no indexing here
        // System.out.println(nums);
        // for(int n : nums){
        //     System.out.println(n);
        // }
        //instead of for loop can use iterator
        // Iterator<Integer> values = nums.iterator();
        // val

        // Map<String, Integer> students =new HashMap<>();
        // Map<String, Integer> students =new Hashtable<>(); //same as HashMAp but Hashtable is syncronised and used when there are multiple threads.

        // //keys are sets and values are list and muttable.
        // students.put("S",98);
        // students.put("H", 97);
        // students.put("M", 96);
        // System.out.println(students.keySet());
        // for (String key : students.keySet())
        // {
        //     System.out.println(key+" : "+students.get(key));
        // }
        Comparator<Integer> com = new Comparator<Integer>() //this is use to sort acc to the logic u require
        {
            public int compare(Integer i , Integer j){
                if(i%10>j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(79);
        nums.add(41);
        nums.add(82);
        nums.add(27);
        Collections.sort(nums,com);
        System.out.println(nums);




    }
}
