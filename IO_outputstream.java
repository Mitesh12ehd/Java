import java.io.*;

public class IO_outputstream {
    public static void main(String args[]) throws Exception{
        String m = "india is my country and\n"+"i love my country so much";
        byte b[] = m.getBytes();

        OutputStream obj = new FileOutputStream("C:/Users/Mitesh/OneDrive/Desktop/input.txt");
        for(int i=0; i<b.length; i++){
            obj.write(b[i]);
        }
        obj.close();
    }
}
