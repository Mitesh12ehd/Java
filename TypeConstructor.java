public class TypeConstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        Student s2 = new Student("MITESH");
        Student s3 = new Student(124);         
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("constructor is called");
    }
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}