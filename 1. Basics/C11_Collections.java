import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class C11_Collections {
    public static void main(String[] args) {

        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(1);
        // nums.add(1);
        // nums.add(1);

        // Set<Integer> nums = new TreeSet<>();
        // nums.add(6);
        // nums.add(7);
        // nums.add(8);
        // nums.add(5);
        // nums.add(4);
        // nums.add(3);

        // Iterator<Integer> itr = nums.iterator();

        // while(itr.hasNext()){
        // System.out.println(itr.next());
        // }
        // // System.out.println(itr.next());

        // Map<Integer, String> mp = new HashMap<>();
        // mp.put(1, "One");
        // mp.put(2, "Two");
        // System.out.println(mp);

        // Collection class
        // List<Integer> nums = new ArrayList<>();
        // nums.add(1);
        // nums.add(9);
        // nums.add(10);
        // nums.add(8);
        // nums.add(7);
        // nums.add(6);
        // nums.add(0);

        // // Collections.sort(nums);

        // Comparator<Integer> comp = new Comparator<Integer>(){
        //     public int compare(Integer a, Integer b){
        //         if(a < b){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // };

        // Collections.sort(nums, comp);

        // for (int n : nums) {
        //     System.out.println(n);
        // }

        List<String> nums = new ArrayList<>();
        nums.add("Mitesh");
        nums.add("gfkjfkgdf");
        nums.add("gfklgjdf");
        nums.add("ioesln");
        nums.add("sdfkljf");
        nums.add("troiu");

        Collections.sort(nums);

        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(a < b){
                    return 1;
                }
                else{
                    return -1;
                }
            }
        };

        Collections.sort(nums, (a,b) -> b.compareTo(a) );

        for (String n : nums) {
            System.out.println(n);
        }

    }
}
