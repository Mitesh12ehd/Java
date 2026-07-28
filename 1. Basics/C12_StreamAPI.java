import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class C12_StreamAPI {
    public static void main(String[] args) {
        
        // List<Integer> nums = Arrays.asList(4,5,7,2);

        // // Filter even numbers, and double those values, and result should be sum of all
        // int sum = 0;
        // for(int n:nums){
        //     if(n % 2 == 0){
        //         n = n*2;
        //         sum += n;
        //     }
        // }
        // System.out.println(sum);

        // nums.forEach(n -> System.out.println(n));

        // Stream can be used only once
        // Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));
 
        // List<Integer> nums = Arrays.asList(4,5,7,2,6,4,2,7,5);
        // // nums.stream().filter(n -> n%2 == 0).sorted().forEach(n -> System.out.println(n));
        // nums.parallelStream().forEach(System.out::println);
        // System.out.println("Hello");

        // Parallel stream example
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i=0; i<10000; i++){
            list.add(random.nextInt(100));
        }

        long startSeq = System.currentTimeMillis();
        int sum1 = list.stream().map(i -> i*2).mapToInt(i -> i).sum();
        long endSeq = System.currentTimeMillis();

        long startPara = System.currentTimeMillis();
        int sum2 = list.parallelStream().map(i -> i*2).mapToInt(i -> i).sum();
        long endPara = System.currentTimeMillis();
        
        System.out.println(sum1 + " " + sum2);
        System.out.println("Seq: " + (endSeq - startSeq));
        System.out.println("Para: " + (endPara - startPara));
    }   
}
