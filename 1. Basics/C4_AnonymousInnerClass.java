abstract class A{
    public abstract void show();
    public abstract void play();
}

public class C4_AnonymousInnerClass{
    public static void main(String[] args) {
        
        // here we are creating object of anonymous inner class

        A obj = new A(){
            public void show(){
                System.out.println("In overridden show");
            }
            public void play() {
                System.out.println("In play");
            }
            
        };

        obj.show();
    }
}