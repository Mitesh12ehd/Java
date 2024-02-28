import java.util.*;
public class SelectionSort{
    public static void sort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            // find minimum
            int min_index = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // swapping
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String args[]){
        int arr[] = {5,2,9,3,4,1,8,6,7};
        sort(arr);
        System.out.println("sorted array is:" + Arrays.toString(arr));


    }
}