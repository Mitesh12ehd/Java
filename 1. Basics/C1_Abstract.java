// Abstract class and method:
//     - we need abstract method when we just want to define schema not the implementation
//     - child class must implement that methods

//     - we can create one more abstract class, that extends main abstract class, inside child abstract class
//       we can implement only some methods and will let implement remaining methods to further child.

//     Points:
//         - abstract class may have abstract and non-abstract method
//         - abstract method can only be inside abstract class

//         - object of abstract class can't be created
//         - We can create reference of abstract class

abstract class Car{
    public abstract void drive();
    public abstract void play();
    public void playMusic(){
        System.out.println("Play music");
    }
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("WagonR Driving");
    }
}

class UpdateWagonR extends WagonR{
    public void play(){
        System.out.println("Play");
    }
}

public class C1_Abstract{
    public static void main(String[] args) {
        UpdateWagonR obj = new UpdateWagonR();
        obj.play();
    }
}