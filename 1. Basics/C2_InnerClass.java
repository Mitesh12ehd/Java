// class A{
//     int age;
//     public void show(){
//         System.out.println("In show");
//     }
//     class B{
//         public void config(){
//             System.out.println("In config");
//         }
//     }
// }

class A{
    int age;
    public void show(){
        System.out.println("In show");
    }
    static class B{
        public void config(){
            System.out.println("In config");
        }
    }
}

public class C2_InnerClass{
    public static void main(String[] args) {
        // A obj = new A();
        // obj.show();

        // A.B obj2 = obj.new B();
        // obj2.config();

        // // when inner class is static
        // A.B obj1 = new A.B();
        // obj1.config();

    }
}