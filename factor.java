import java.util.*;
public class factor{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter number");
        n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.println(i+" ");
            }
        }
    }
}