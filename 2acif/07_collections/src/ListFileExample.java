import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class ListFileExample {
    public static void main(String[] args) {
        readFile("07_collections/nums.txt");
    }

    static void readFile(String path){
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch (IOException ex){
            System.err.println("failed to read file");
        }
    }
}
