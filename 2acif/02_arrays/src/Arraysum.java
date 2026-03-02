import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        final String[] POSITIONS = {
                "", // 0
                "ersten", // 1
                "zweiten", // 2
                "dritten", // 3
                "vierten", // 4
         };

        int[][] matrix = {
                {10, 20, 30, 40, 50}, // 1. Zeile / Index 0
                {15, 25, 35, 45, 55}, // 2. Zeile / Index 1
                {12, 22, 32, 42, 52}, // 3. Zeile / Index 2
                {18, 28, 38, 48, 58}  // 4. Zeile / Index 3
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Summe welcher Zeile?");
        int row = scanner.nextInt();
        if(row > 0 && row <= matrix.length){
            int sum = 0;

            for (int i = 0; i < matrix[row - 1].length; i++) {
                sum = sum + matrix[row-1][i]; // sum  += matrix[row-1][i];
            }

            System.out.printf("Summe der %s Zeile ist %d%n", POSITIONS[row], sum);
        }else {
            System.out.println("Ungültige Eingabe");
        }
        scanner.close();
    }
}
