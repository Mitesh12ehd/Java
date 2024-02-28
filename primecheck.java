import java.util.*;
public class primecheck{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int n = sc.nextInt();

        boolean m = true;
        int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                m = true;
            }
        }
        if(m){
            System.out.println("number is prime");
        }
        else{
            System.out.println("number is not prime");
        }
    }
}