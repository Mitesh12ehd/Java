import java.util.*;
public class pattern1{
    public static void main(String args[])
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(int row=1; row<=n; row++){
            for(int column=1; column<=row; column++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}