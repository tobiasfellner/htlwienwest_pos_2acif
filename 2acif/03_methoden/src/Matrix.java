public class Matrix {
    public static void main(String[] args) {
        int[][] src = {
                {1,1,1},
                {2,2,2},
                {3,3,3}
        };

        int[][] secondMatrix = {
                {5,5,5},
                {6,6,6},
                {7,7,7}
        };

        int[][] resultScalarMul = mul(src, 3);
        printMatrix(resultScalarMul);

        printMatrix(add(src, secondMatrix));
//        mul2(src, 3);
    }

    static int[][] mul(int[][] arr, int scalar){
        int[][] result = new int[arr.length][arr[0].length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                result[i][j] = arr[i][j] * scalar;
            }
        }
        return result;
    }
    static void mul2(int[][] arr, int scalar){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = arr[i][j] * scalar;
            }
        }
    }
    static void printMatrix(int[][] arr){
        System.out.printf("===================== %dx%d-Matrix%n", arr.length, arr[0].length);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static int[][] add(int[][] a, int[][] b){
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
}
