import java.util.*;

public class factorial_resursion {
    public static int fact(int n){
        int hw;
        if(n<0){
            System.out.println("nagative parameter are not allowed");
            hw = -1;
        }
        else if(n==0){
            hw = 1;
        }
        else{
            hw = n*(fact(n-1));
        }
        return hw;
    }
    
    public static void main(String args[]){
        Scanner m = new Scanner(System.in);
        System.out.println("enter number");
        int n = m.nextInt();
        System.out.println("ans = "+fact(n));
    }
}
