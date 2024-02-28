import java.util.*;
public class bintodec{
    public static void bintodec(int bin){
        int temp = bin;
        int pow = 0;
        int dec = 0;

        while(bin > 0){
            int lastdigit = bin % 10;
            dec = dec + ( lastdigit * (int) Math.pow(2,pow));
            pow++;
            bin = bin / 10;
        }
        System.out.println("deciaml of " +temp+ " = " +dec);
    }
    public static void main(String args[]){
        bintodec(101);
    }
}