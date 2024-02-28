public class Exception3{
    public static void fun(int a[]){
        int c;
        try{
            c = a[0]/a[3];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught exception"+e);
        }
    }
    public static void main(String args[]){
        int a[] = {10,5};
        fun(a);
        
    }
}