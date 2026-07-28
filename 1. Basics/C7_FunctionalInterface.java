
@FunctionalInterface
interface A{
    void show(int i);
}

@FunctionalInterface
interface B{
    int add(int i, int j);
}

public class C7_FunctionalInterface {
    public static void main(String[] args) {
        
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };

        // A obj = () -> {
        //     System.out.println("in show");
        // };

        // A obj = () -> System.out.println("in show");

        // A obj = (int i) -> System.out.println("In show " + i);

        // A obj = (i) -> System.out.println("In show " + i);

        A obj = i -> System.out.println("In show " + i);

        obj.show(5);

        // return examples
        // B b = new B(){
        //     public int add(int i, int j){
        //         return i+j;
        //     }
        // };

        // B b = (i,j) -> {
        //     return i+j;
        // };

        B b = (i,j) -> i+j;

        int result = b.add(5, 6);
        System.out.println(result);
    }
}
