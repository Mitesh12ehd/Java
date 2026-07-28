import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C13_OptionalClass {
    public static void main(String[] args) {


        // Optional class is to avoid null pointer exception

        // Without optional class
        // if name is null, then there is null pointer exception
        // String name = getName();

        // // With Optional class
        // Optional<String> output = getName();
        // String name = output.orElse("Not found");
        
        // Other example
        List<String> names = Arrays.asList("Navin", "Laxmi", "John", "Kishor");

        String name = names.stream()
                .filter(str -> str.contains("x"))
                .findFirst()
                .orElse("Not Found");

        System.out.println(name);
    }
}
