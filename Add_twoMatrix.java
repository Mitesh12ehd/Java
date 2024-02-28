import java.util.*;
public class Add_twoMatrix{
    public static void main(String[] args) {
        int size;
        int a[][],b[][],c[][];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of an array:");
        size=sc.nextInt();
        a=new int[size][size];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print("Entera["+i+"]["+j+"]:");
                a[i][j]=sc.nextInt();
            }
        }
        b=new int[size][size];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                System.out.print("Enterb["+i+"]["+j+"]:");
                b[i][j]=sc.nextInt();
            }
        }
        c=new int[size][size];
        for(int i=0;i<c.length;i++){
            for(int j=0;j<c.length;j++){
                System.out.print("c["+i+"]["+j+"]:"+(a[i][j]+b[i][j])+"\t");
            }
            System.out.println();
        }
    }
}
