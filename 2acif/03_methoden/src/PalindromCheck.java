import java.util.Scanner;

public class PalindromCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Text eingeben: ");
        String text = scanner.nextLine();

        boolean isP = isPalindrom(text);
        System.out.printf("Der Text '%s' ist %sein Palindrom", text, isP ? "" : "k" );

        // VARIABLE = BEDINGUNG ? IF-Zweig: ELSE-Zweig
        String result = text.length()>0 ? "JA" : "NEIN";

        String result2;
        if(text.length() > 0){
            result = "JA";
        }else{
            result="NEIN";
        }
    }

    static boolean isPalindrom(String text){
        if(text == null || text.isEmpty()){
            return false;
        }

        text = text.toLowerCase();

        for (int i = 0; i < text.length()/2; i++) {
            if(text.charAt(i) != text.charAt(text.length()- 1 - i)){
                return false;
            }
        }

        return true;
    }
}
