import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class C14_MethodReference {
    public static void main(String[] args) {
        
        // Print list of string into uppercase without method reference
        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor");
        List<String> uNames = names.stream().map(name -> name.toUpperCase()).collect(Collectors.toList());
        
        // Using method reference
        List<String> uNames2 = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        
        // Print list using method reference
        names.forEach(System.out::println);

        // Constructor reference 
    }
}
