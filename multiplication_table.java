import java.util.*;
public class multiplication_table{
    public static void main(String args[]){
        int n,ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        n = sc.nextInt();

        for(int i=1; i<=10; i++){
            ans = n*i;
            System.out.println(n +" * "+ i +" = " +ans);
        }
    }
}