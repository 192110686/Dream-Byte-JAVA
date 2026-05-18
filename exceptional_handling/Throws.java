import java.io.FileReader;
import java.io.IOException;
public class Throws {
    static void readFile()throws IOException {
        FileReader fr = new FileReader("abc.txt");
    }
    public static void main(String[] args){
        try{
        readFile();
        }
        catch(IOException e){
        System.out.println("File problem occured");
        }
        System.out.println("Program ended");
    }
}
/*throws is used in method declaration to 
indicate that the method may produce an exception. */