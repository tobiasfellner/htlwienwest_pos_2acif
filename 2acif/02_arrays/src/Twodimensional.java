import java.util.Scanner;

public class Twodimensional {
    public static void main(String[] args) {
        int[][] m = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        //1. Vom Benutzer 9 Werte einlesen und in 3x3 Array speichern
        for (int row = 0; row < m.length; row++){
            for (int col= 0; col < m[row].length; col++){
                System.out.printf("Zahl für (%d,%d) eingeben: ", row, col);
                m[row][col] = scanner.nextInt();;
            }
        }

        //2. Ausgabe des Arrays
        /* 1 2 3
           4 5 6
           7 8 9
         */
        for (int row = 0; row < m.length; row++){
            for (int col= 0; col < m[row].length; col++){
                System.out.print(m[row][col]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
