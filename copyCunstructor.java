
public class copyCunstructor{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "mitesh";
        s1.roll = 123;

        Student s2 = new Student(s1);
    }
}

class Student{

    String name;
    int roll;

    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
    }

    Student(){
        System.out.println("########");
    }
    
    Student(String name){
        this.name = name;
    }
    Student(int roll){
        this.roll = roll;
    }
}