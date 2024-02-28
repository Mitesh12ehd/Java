import java.util.*;
public class power{
    public static int pow(int n1,int n2){
        int i;
        int ans = 1;
        for(i=1; i<=n2; i++){
            ans = ans*n1;
        }
        return ans;
    }
    public static void main(String args[]){
        int n1 = 9;
        int n2 = 3;
        System.out.println("ans is:" + pow(n1,n2));
    }
}