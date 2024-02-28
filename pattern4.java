import java.util.*;
public class pattern4{
    public static void main(String args[])
    {
        char ch = 'A';
        for(int row=1; row<=4; row++){
            for(int column=1; column<=row; column++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}