import java.io.*;
public class FileHandle{
    public static void main(String args[]){
        File myFile=new File("mc.txt");
        try{
            myFile.createNewFile();
        }
        catch(IOException e){
            System.out.println("unable to create file");
        }
    }
}