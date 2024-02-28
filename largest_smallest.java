import java.util.*;
public class largest_smallest{
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static int getsmallest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,6,3,5};
        System.out.println("largest element is " + getlargest(numbers));
        System.out.println("smallest element is " + getsmallest(numbers));
    }
}