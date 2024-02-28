import java.util.*;
public class Abstract{
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.walk();

        Dog d = new Dog();
        d.eat();
        d.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walking");
    }
}

class Dog extends Animal{
    void walk(){
        System.out.println("walk 2");
    }
}