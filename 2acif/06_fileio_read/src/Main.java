import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int index = 1;
        try(BufferedReader reader = new BufferedReader(new FileReader("06_fileio_read/hello.txt"))){
            String line;

            while((line = reader.readLine()) != null){
                System.out.println(index+": "+line);
                index++;
            }

        }catch (IOException e){
            System.out.println("Fehler beim Lesen!");
        }
    }
}