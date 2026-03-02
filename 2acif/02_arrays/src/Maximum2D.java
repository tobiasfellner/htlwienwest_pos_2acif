import java.util.Random;

public class Maximum2D {
    public static void main(String[] args) {
        Random r = new Random();
        int[][] arr = {
                {r.nextInt(), r.nextInt(), r.nextInt()},
                {r.nextInt(), r.nextInt(), r.nextInt()},
                {r.nextInt(), r.nextInt(), r.nextInt()},
                {r.nextInt(), r.nextInt(), r.nextInt()}
        };

        // todo Aufgabe: Maximum berechnen und index ausgeben
        // Bsp: Das Maximum liegt auf (1,1) und hat den Wert 1300.

        //             arr[row][col]
        int maxValue = arr[0][0];
        int maxRowIndex = 0;
        int maxColIndex = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > maxValue){
                    maxValue = arr[row][col];
                    maxRowIndex = row;
                    maxColIndex = col;
                }
            }
        }

        System.out.printf("Das Maximum liegt auf (%d,%d) und hat den Wert %d%n", maxRowIndex, maxColIndex, maxValue);
    }
}
