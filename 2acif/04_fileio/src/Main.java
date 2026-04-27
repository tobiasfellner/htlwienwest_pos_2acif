import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int result1 = add(1,2);
        System.out.println(result1);
        System.out.println(add("Hello", "World"));
    }

    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static String add(String a, String b){
        String result = a + b;
        return result;
    }
}