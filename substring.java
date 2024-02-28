import java.util.*;
public class substring{
    public static String substring(String str, int start, int end){
        String sub = "";
        for(int i=start; i<end; i++){
            sub = sub + str.charAt(i);
        }
        return sub;
    }
    public static void main(String args[]){
        String str = "Namste Dunia";
        System.out.println(substring(str, 0,12));
    }
}