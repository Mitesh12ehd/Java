import java.util.*;
public class nCr{
    public static int factorial(int n)
    {
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;

        }
        return f;
    }

    public static int nCr(int n,int r)
    {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int rMn_fact = factorial(n-r);

        int ans = n_fact / ( r_fact * rMn_fact);
        return ans;
        
    }
    
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        int number;
        System.out.print("enter number : ");
        number = sc.nextInt();
        int r;
        System.out.print("enter r : ");
        r = sc.nextInt();
        System.out.print("ans is : "+nCr(number,r));

    }
}