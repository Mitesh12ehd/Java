import java.util.*;
public class evenOrOdd{
    public static void check(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        } 
    }
    public static void main(String args[]){
        check(3);
        check(6);
        check(12);
    }
}   




































