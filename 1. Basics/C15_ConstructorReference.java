import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Student{
    private String name;
    private int age;
    public Student(){
        name = "";
        age = 0;
    }
    public Student(String name){
        this.name = name;
        age = 0;
        
    }
}

public class C15_ConstructorReference {

    public static int sum(int a,int b){
        var c = a+b;
        return c;
    }

    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Mitesh", "Harsh", "John");
        List<Student> students = new ArrayList<>();

        // Create student normally
        names.stream().map(name -> new Student(name)).collect(Collectors.toList());

        // Create using constructor reference
        names.stream().map(Student::new).collect(Collectors.toList());

    }
}
