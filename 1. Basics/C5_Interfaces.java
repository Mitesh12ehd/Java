// Object can't be created ob interface same as abstract class
// Interface don't have memory in heap

interface A{

    // all variable inside interface are public, final and static
    int age=44;

    // by default all the methods are public abstract
    void show();
    void config();
}

class B implements A{
    public void show() {
        System.out.println("In show");
    }
    public void config() {
        System.out.println("In config");
    }

}

public class C5_Interfaces {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
}
