import java.io.*;
public class IO_inputstream{
    public static void main(String args[]) throws Exception
    {
        InputStream obj = new FileInputStream("D:/vs code/Java/IO_inputstream.java");
        int n= obj.available();
        System.out.println("total available bytes = "+n);
        int m= n-400;
        System.out.println("read first "+m+"byte ");

        for(int i=0; i<m; i++){
            System.out.print((char)obj.read());
        }
        System.out.println("skkip some next");
        obj.skip(n/2);
        System.out.println("still available = "+obj.available());
        obj.close();
    }
}