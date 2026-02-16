import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // a => a
        // b => ab
        // x => abx
        // 2 => abx und abbrechen

        Scanner scanner = new Scanner(System.in);
        String result = "";

        char c;
        do {
            System.out.println("char eingeben:");
            c = scanner.nextLine().charAt(0);
            if (Character.isAlphabetic(c)) {
                result = result + c;
            }
        } while (Character.isAlphabetic(c));

        System.out.println(result);

    }
}
