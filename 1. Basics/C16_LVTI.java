import java.util.ArrayList;

class Student{}

public class C16_LVTI {
    public static void main(String[] args) {
        
        // Local variable type inference
        // Introduced in java 10

        // For local variable we can use var keyword instead of type of variable

        var obj = new ArrayList<>();
        int a = 9;
        var b = 8;

        // Is java become dynamically typed using this concept?
        // No, Compiler decide its type
        // in dynamically type we can change type later

        // Below is not allowed
        // local variable with var should not be without initializer
        var b;

        // is var is reserved keyword?
        // no, we can use it as variable name

        // use var in array
        int nums[] = new int[10];
        var nums2 = new int[100];   // it must be without []

        // Use as reference variable of object
        var obj2 = new Student();

    }
}
