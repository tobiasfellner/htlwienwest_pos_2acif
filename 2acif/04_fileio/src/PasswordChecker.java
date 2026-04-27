import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Passwort eingeben: ");
        String password = scanner.nextLine();
        boolean check01 = isLongEnough(password);
        boolean check02 = hasDigit(password);
        System.out.printf("Mindestens 8 Zeichen: %b%n", check01);
        System.out.printf("Hat eine Ziffer: %b%n", check02);
        System.out.printf("Sicheres Passwort: %b%n", check01 && check02);

        scanner.close();
    }

    public static boolean isLongEnough(String s){
        if(s.length() >= 8){
            return true;
        }else {
            return  false;
        }
    }

    public static boolean hasDigit(String password){
        for (int i = 0; i < password.length(); i++) {
            if(Character.isDigit(password.charAt(i))){
                return true;
            }
        }
        return false;
    }
}
