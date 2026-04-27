import java.util.Arrays;
import java.util.Scanner;

public class Notenrechner {
    public static void main(String[] args) {
        int[] grades = readGrades();
        printGrades(grades);
    }
    public static int[] readGrades(){
        int[] grades = new int[100];
        Scanner scanner = new Scanner(System.in);
        int note;
        int index = 0;

        do{
            System.out.print("Note eingeben (0 = Ende):");
            // note = Integer.parseInt(scanner.nextLine());
            note = scanner.nextInt();
            scanner.nextLine();

            if(note >= 0  && note <= 5){
                grades[index] = note;
                index++;
            }else{
                System.out.println("Fehlerhafte Eingabe. Wiederholen");
            }

        }while(note != 0 && index < grades.length - 1);

        scanner.close();
        return grades;
    }

    public static void printGrades(int[] myGrades){
        for (int i = 0; i < myGrades.length; i++) {
            if(myGrades[i]!= 0){
                System.out.print(myGrades[i]+ " ");
            }
        }

    }
}
