import java.util.*;
public class dropdown_switchcase{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num[] = new int[5];
        for(int i=0; i<5; i++){
            System.out.print("enter "+i );
            num[i] = sc.nextInt();
        }

        int max,min;
        int choice;
        System.out.println("1.smallest \n 2.largest \n 3.sum \n 4.avg");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                min = num[0];
                for(int j=0; j<5; j++){
                    if(num[j] < min){
                        min = num[j];
                    }
                }
                System.out.println("smallest element is "+min);
                break;
            
            case 2:
                max = num[0];
                for(int m=0; m<5; m++){
                    if(num[m] > max){
                        max = num[m];
                    }
                }
                System.out.println("largest element is "+max);
                break;

            case 3:
                int sum = 0;
                for(int n=0; n<5; n++){
                    sum = sum + num[n];
                }
                System.out.println("sum is "+sum);
                break;

            case 4:
                int total = 0;
                for(int r=0; r<5; r++){
                    total = total + num[r];
                }
                System.out.println("avg is "+total/5);
                break;

            default:
                System.out.println("enter valid choice");
                break;
        }
    }
}