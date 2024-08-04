import java.util.*;
import java.io.*;
class FileReadException extends Exception{
    FileReadException(String msg,Throwable cause){
        super(msg,cause);
    }
}
public class Exception_chaining{
    public static void main(String[] args){
        try{
            ReadFile();
        }
        catch(FileReadException fe){
            System.out.println("Caught FileReadException: " +fe.getMessage());
            System.out.println("Original Exception: " +fe.getCause().getClass().getName());
            System.out.println("Cause Message: "+fe.getCause().getMessage());
        }
    }
    public static void ReadFile() throws FileReadException{
        try{
            throw new IOException("Error wile reading file");
        }
        catch(IOException ie){
            throw new FileReadException("Error reading file",ie);
        }
    }
}