import java.io.*;
import java.text.spi.DateFormatProvider;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Scanner;

public class Notizen {
    public static void main(String[] args) {
        // 1. Notiz einlesen
//        String note = readNote();
        final String filename = "06_fileio_read/notes.txt";

        // 2. Notiz in Datei schreiben
//        writeToFile(note, filename);

//        int[] arrA = new int[10];
//        arrA[0] = 123;
//        arrA[1] = 456;
//
//        int arrB[] = clone(arrA);
//        arrB[0] = -1;

        String[] content = readFileContent(filename);
    }

    static int[] clone(int[] a, int newSize){
        int[] b = new int[newSize];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    static String[] clone(String[] a, int newSize){
        String[] b = new String[newSize];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

    static String[] doubleSize(String[] a){
        return clone(a, a.length*2);
    }
    static int[] doubleSize(int[] a){
        return clone(a, a.length*2);
    }

    static int[] clone(int[]a){
        return clone(a, a.length);
    }

    static String readNote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notiz eingeben: ");
        String note = scanner.nextLine();
        scanner.close();
        return note;
    }

    static void writeToFile(String content, String filename){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss.SSS");
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))){
            LocalDateTime now = LocalDateTime.now();
            writer.write(String.format("[%s] %s", now.format(df), content));
            writer.newLine();
        }catch (Exception e){
            System.err.println("Fehler beim Schreiben");
        }
    }

    static String[] readFileContent(String filename){
        String[] lines = new String[10];
        int i = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){

            while((lines[i] = reader.readLine()) != null){
                if(i >= lines.length-1){
                    lines = doubleSize(lines);
                }
                i++;
            }
        }catch (IOException e){
            System.err.println("Fehler beim lesen");
        }
        return lines;
    }
}
