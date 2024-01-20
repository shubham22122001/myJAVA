class Student
{
    int rollno;
    String name;
    int marks;
}


public class array {
    public static void main(String[] args) {
        // int nums[] ={3,4,5,6};
        int nums[]= new int[4];
        nums[0]=1;
        nums[1]=9;
        nums[2]=8;
        nums[3]=3;
        // for(int i = 0;i<4;i++){
        //     System.out.println(nums[i]);

        // }

        // for(int n:nums) //one more method to prrint each value of array and this is better and this doesnt have exception...
        // {
        //     System.out.println(n);
        // }
        // int nums[][]=new int[3][4];
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         nums[i][j]=(int)(Math.random()*10);
        //     }
        // }
        // for(int i=0;i<3;i++)
        // {
        //     for(int j=0;j<4;j++)
        //     {
        //         System.out.print(nums[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------------");
        // // special for loop to print 2d array
        // for(int n[]:nums)
        // {
        //     for(int m:n)
        //     {
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println("-------------------------------");

        // // JAGGED ARRAYS - are the arrays where internal size(number of columns) is not specified for eg: int[3][]..to specify the number of columns we have to MANUALLY.
        // int nums1[][]=new int[3][];
        // nums1[0]= new int[3];
        // nums1[1]= new int[4];
        // nums1[2]= new int[2];
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums1[i].length;j++)
        //     {
        //         nums1[i][j]=(int)(Math.random()*10);
        //     }
        // }
        // for(int n[]:nums1)
        // {
        //     for(int m:n)
        //     {
        //         System.out.print(m+" ");
        //     }
        //     System.out.println();
        // }

            Student s1= new Student();
            s1.rollno =1;
            s1.name="Shubham";
            s1.marks=98;

            Student s2= new Student();
            s2.rollno =2;
            s2.name="Mehul";
            s2.marks=97;
            Student s3= new Student();
            s3.rollno =3;
            s3.name="Harsh";
            s3.marks=96;

            Student students[] = new Student[3];
            students[0]=s1;
            students[1]=s2;
            students[2]=s3;
            // for (int i=0;i<students.length;i++)
            // {
            //     System.out.println(students[i].name+" "+students[i].marks);

            // }
            for (Student stud:students) //enhanced for loop
            {
                System.out.println(stud.name+":"+stud.marks);
            }


    }
}
