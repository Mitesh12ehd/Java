public class Exception2{
    public static void main(String args[]){
        int c;
        int a[] = {10,5};
        try{
            c = a[0]/a[3];
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught exception"+e);
        }
    }
}