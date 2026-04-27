import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteIntro {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("04_fileio/output.txt"));
            writer.write("Hello World");
            writer.newLine();
            writer.write("1234");
            writer.close();
        }catch (IOException e){
            // ignorieren
        }
    }
}
