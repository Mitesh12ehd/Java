import java.util.*;
public class pattern2{
    public static void main(String args[])
    {
        for( int row=1; row<=4; row++){
            for( int column=1; column<= 4-row+1; column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}