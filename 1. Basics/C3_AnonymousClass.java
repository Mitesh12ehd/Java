class A{
    public void show(){
        System.out.println("In show");
    }
}

public class C3_AnonymousClass{
    public static void main(String[] args) {
        
        A obj = new A(){
            public void show(){
                System.out.println("In overridden show");
            }
        };

        obj.show();

        // If we will check class created by this code compilation
        // it is something like C3_AnonymousInnerClass$1
        // as second class in anonymous
    }
}