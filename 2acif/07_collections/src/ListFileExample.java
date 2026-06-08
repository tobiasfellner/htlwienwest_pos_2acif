import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ListFileExample {
    public static void main(String[] args) {
        final String FILENAME = "07_collections/nums.txt";
        List<Integer> nums = readFile(FILENAME);
        System.out.println(nums);
        printNumsNoLineNumbers(nums);
        printNumsWithLineNumbers(nums);
        System.out.println("================================== * 10");
        List<Integer> newList = multiplyBy(nums, 10);
        printNumsWithLineNumbers(newList);
        writeFile(FILENAME, newList);
    }

    static List<Integer> readFile(String path){
        List<Integer> lst = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            String line;
            while ((line = reader.readLine()) != null){
                int val = Integer.parseInt(line);
                lst.add(val);
            }
        }catch (IOException ex){
            System.err.println("failed to read file");
        }

        return lst;
    }

    static void printNumsNoLineNumbers(List<Integer> x){
        System.out.println("================================== printNumsNoLineNumbers");
        for(int item : x){
            System.out.println(item);
        }
    }

    static void printNumsWithLineNumbers(List<Integer> x){
        System.out.println("================================== printNumsWithLineNumbers");
        for (int i = 0; i < x.size(); i++) {
            System.out.printf("%d: %d%n", i+1, x.get(i));
        }

    }

    static List<Integer> multiplyBy(List<Integer> lst, int m){
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < lst.size(); i++) {
            int newVal = lst.get(i) * m;
            result.add(newVal);
        }

        return result;
    }

    static void writeFile(String path, List<Integer> lst){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            for (int item : lst){
                writer.write(""+item);
                writer.newLine();
            }
        }catch (IOException e){
            System.err.println("Write failed: " + e.getMessage());
        }
    }
}
