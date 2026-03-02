import java.util.Scanner;

public class Maximum1D {
    public static void main(String[] args) {
        // todo 1. fragen Sie den Benutzer, wie viele Zahlen er einlesen möchte
        System.out.println("Wie viele Zahlen?");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        // todo 2. Legen Sie ein eindimensionales Array mit der Länge an (z.B. 3)
        int[] arr = new int[size];

        // todo 3. Einlesen der Zahlen und speichern im Array
        for (int i = 0; i < arr.length; i++){
            System.out.println((i+1)+". Zahl eingeben:");
            arr[i] = input.nextInt();
        }

        // todo 4. Array durchlaufen und Maximum berechnen
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }

        // todo 5. Maximum ausgeben
        System.out.printf("Maximum ist auf Index %d: %d%n", maxIndex, max);

        input.close();
    }
}
