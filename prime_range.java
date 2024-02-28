import java.util.*;
public class prime_range{
    public static boolean isprime(int n)
    {
        boolean isprime = true;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return isprime;
    }
    public static void primeInRange(int n)
    {
        for(int i=2; i<=n; i++){
            if(isprime(i)) {
                System.out.println(i);
            }
        }
    } 
    public static void main(String args[])
    {
        primeInRange(10);
    }
}