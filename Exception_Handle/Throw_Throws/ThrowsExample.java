package Throw_Throws;
import java.io.IOException;
public class ThrowsExample {

  public static void readfiles() throws IOException{

    throw new IOException("File could not be read.");
  
}
    public static void main(String[] args) {
        try {
             readfiles();

        } catch (IOException e) {
            
           System.out.println("Error " + e.getMessage());

        }
    }
}