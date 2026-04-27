import java.util.Arrays;
import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {
        int[] grades = readGrades();
        printGrades(grades);
        double avg = calculateAverage(grades);
        System.out.println("Average: " + avg);
    }

    public static int[] readGrades() {
        int[] grades = new int[100];
        Scanner scanner = new Scanner(System.in);
        int note;
        int index = 0;

        do {
            System.out.print("Note eingeben (0 = Ende):");
            // note = Integer.parseInt(scanner.nextLine());
            note = scanner.nextInt();
            scanner.nextLine();

            if (note >= 0 && note <= 5) {
                grades[index] = note;
                index++;
            } else {
                System.out.println("Fehlerhafte Eingabe. Wiederholen");
            }

        } while (note != 0 && index < grades.length - 1);

        scanner.close();
        return grades;
    }

    public static void printGrades(int[] myGrades) {
        for (int i = 0; i < myGrades.length; i++) {
            if (myGrades[i] != 0) {
                System.out.print(myGrades[i] + " ");
            }
        }
        System.out.println();
    }

    public static double calculateAverage(int[] arr) {
        double sum = 0;
        int countValidInputs = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                countValidInputs++;
                sum += arr[i];
            }
        }
        double avg1 = sum / arr.length; // WRONG! => arr.length ist 100 (inkludiert 0en)
        double avg2 = sum / countValidInputs;
        return sum / countValidInputs;
    }

    public static boolean hasPassed(double avg) {
        boolean hasPassed = false;

        if (avg <= 4) {
            hasPassed = true;
        }
        return hasPassed;
    }

    public static boolean hasPassed2(double avg) {
        return avg <= 4.0;
    }
}
