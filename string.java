public class string {
    public static void main(String[] args) {
        // String name =new String("shubhan");
        // System.out.println("hello "+ name);
        // System.out.println(name.charAt(1));
        // String name="shubham"; //this is constant 
        // name= name+ " bhadra"; //name doesnot change but this will have different address and obj
        // String s1="Shubham";
        // String s2="Shubham";
        // System.out.println(s1==s2);

        //For MUTTABLE(changable) Strings use String Buffer
        StringBuffer sb = new StringBuffer("Shubham");
        // System.out.println(sb.capacity());
        sb.append(" Bhadra");
        System.out.println(sb);
        //can not convert string buffer to string but there is a way mf
        // String str = sb.toString();
        


    }

}
