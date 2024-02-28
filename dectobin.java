import java.util.*;
public class dectobin{
    public static void decimalTobinary(int n){
        int temp = n;
        int pow = 0;
        int bin = 0;

        while(n>0){
            int rem = n %2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.print("binary of " +temp+ " = " +bin );
    }
    public static void main(String args[]){
        decimalTobinary(8);
    }
}