import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class C9_Inputs {
    public static void main(String[] args) throws IOException{

        // // Option 1
        // // Reading ascii value of entered value
        // System.out.println("Enter number");
        // int num = System.in.read(); 
        // System.err.println(num);

        // // Option 2
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);
        
        // bf.close();

        // // Option 3
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        String name = sc.nextLine();
        System.out.println(name);
    } 
}
