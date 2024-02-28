import java.util.*;
public class function{

    public static int sum(int a,int b)
    {
        int sum;
        sum = a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();
        int c;
        c = sum(a,b);
        System.out.println("sum is "+c);

    }
}