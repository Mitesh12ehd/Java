import java.util.Objects;

// class Alien{
//     private final int id;
//     private final String name;

//     public Alien(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     @Override 
//     public String toString(){
//         return "Alien{id=" + id + ", name='" + name + "']";
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj) {
//             return true;
//         }

//         if (obj == null || getClass() != obj.getClass()) {
//             return false;
//         }

//         Alien other = (Alien) obj;

//         return id == other.id &&
//                Objects.equals(name, other.name);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(id, name);
//     }
// }

// record Alien (int id, String name){}

// record class with custom constructor
record Alien (int id, String name){
    public Alien(int id,String name){
        if(id == 0){
            throw new IllegalArgumentException("Id can't be zero");
        }

        // this assignment are optional, it happens automatically even we don't write
        this.id = id;
        this.name = name;
    }
}

public class C18_RecordClass {

    public static void main(String[] args) {

        // // Class can contains logic via methods
        // // Few class only used to store data which called data-carrier class

        // // For that type of class
        // // 1. We can directly use object
        // // 2. Object can be immutable

        // // What if we want to print whole object directly
        // // If print reference address
        // Alien a1 = new Alien(1, "Mitesh");
        // System.out.println(a1);

        // // To print whole object, we need to override toString method in that class
        // System.out.println(a1);

        // // What if we want to compare two object
        // // normally .equals method gives false, 
        // // but we can override it, .equals and .hashcode method
        // Alien a2 = new Alien(2, "John");
        // Alien a3 = new Alien(2, "John");
        // System.out.println(a2.equals(a3));

        // We created class that only store data and used to compare data and print data?
        // We can reduce it using record class
        Alien a2 = new Alien(2, "John");
        Alien a3 = new Alien(2, "John");
        System.out.println(a2.equals(a3));
        System.out.println(a3);

        // Record class can implement interface
        // Record class can have method
        // Record class can have static variable
        // Record class must not have instance variable, it should be defined in parameter

        // How to fetch value?
        System.out.println(a3.name());
    }
}
