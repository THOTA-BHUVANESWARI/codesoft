import java.util.*;
class task2
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Maths marks:");
        int n1=sc.nextInt();
        System.out.println("telugu marks:");
        int n2=sc.nextInt();
        System.out.println("Hindi marks:");
        int n3=sc.nextInt();
        System.out.println("English marks:");
        int n4=sc.nextInt();
        System.out.println("Science marks:");
        int n5=sc.nextInt();
        System.out.println("Social marks:");
        int n6=sc.nextInt();
        int n7=n1+n2+n3+n4+n5+n6;
        System.out.println("the total marks are:"+n7);
        float avg=n7/6;
        System.out.println("the average is:"+avg);
        if (avg>=90)
            System.out.println("grade A");
        else if (avg>=80)
            System.out.println("grade B");
        else if(avg>=70)
        {
            System.out.println("grade C");
        }
        else if(avg>=60)
        {
            System.out.println("Grade D");
        }
        else if(avg>=50)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("the student was failed:");
        }
    }
}