import java.util.*;
public class array{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter size  ");
        int size = sc.nextInt();
        int index[] = new int[size];

        for( int i=0; i<size; i++){
            System.out.print("enter "+i );
            index[i] = sc.nextInt();
        }
        
        System.out.println("array is : ");
        for( int i=0; i<size; i++){
            System.out.println(index[i]);
        }
    }
}