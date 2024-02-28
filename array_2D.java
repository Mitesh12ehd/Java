import java.util.*;
public class array_2D{
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int m = matrix.length;
        int n = matrix[0].length;
        
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.println("enter value");
                matrix[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}