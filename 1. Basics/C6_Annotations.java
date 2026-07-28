// Annotations:
//     - annotations are a way to add metadata to classes, methods, variables, parameters, etc.
//     - Annotations do not directly change the program's behavior, but they provide information to:
//         The Java compiler
//         Frameworks (Spring, Hibernate, JUnit, TestNG)
//         Tools and IDEs
//         Runtime code using Reflection

//     @Override:
//         - to override method of parent class 
//         - if we add override in method which not exist in parent, it give compile error, 
//           so @override helps us to avoid such issue where we may misspell the method name 

//     @Deprecated:
//         - use it, but not recommended 
//         - soon it will be removed
//         - applies on class, methods, variables, constructor, interface, enums, package etc..

class A{
    public void show1(){
        System.out.println("Show");
    }
}

class B extends A{

    @Override
    public void show1(){
        System.out.println("In overridden show");
    }
}

public class C6_Annotations {
    public static void main(String[] args) {
        
    }   
}
