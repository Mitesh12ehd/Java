public class Exception4{
    public static void fun(int a,int b){
        int c;
        if(b==0){
            throw new ArithmeticException("can't divide by zero");
        }
        else{
            c=a/b;
            System.out.println("ans is"+c);
        }
    }
    public static void main(String args[]){
        int a=5;
        fun(a,0);
    }
}