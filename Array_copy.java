import java.util.*;
public class Array_copy{
    public static void main(String args[]){
        int a[] = {1,2,3};
        int b[] = new int[3];

        System.arraycopy(a, 0, b, 0,3);
        a[0]++;
        
        System.out.println("source array"+Arrays.toString(a));
        System.out.println("dest array"+Arrays.toString(b));
    }
}