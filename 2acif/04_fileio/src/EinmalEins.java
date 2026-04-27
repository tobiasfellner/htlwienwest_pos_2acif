import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class EinmalEins {
    public static void main(String[] args) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("04_fileio/1x1.txt"))){
            for (int i = 1; i <= 1000; i++) {
                output(writer, i);
            }
        }catch (IOException e){
            System.err.println("FAILED");
        }
    }

    public static void output(BufferedWriter writer, int num) throws IOException {
        writer.write("============================ "+ num);
        writer.newLine();
        for (int i = 1; i <= 10; i++) {
            writer.write(String.format("%d * %d = %d", num, i, num*i));
            writer.newLine();
        }
    }
}
