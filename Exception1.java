public class Exception1{
    public static void main(String args[]){
        try{
            int a,b,c;
            a=10;
            b=0;
            c=a/b;
        }
        catch(ArithmeticException e){
            System.out.println("can't divide by zero");
            System.out.println("can't divide by zero"+e);
            System.out.println(e);
        }
    }
}