//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[20];
        arr[0] = "Hello";
        arr[1] = "World";
        System.out.println("Länge: "+ getSize(arr));

    }

    static boolean isEven(int num){
        boolean result = false;
        if(num % 2 == 0){
            result = true;
        }

        return result;
    }

    static int getSize(String[] arr){
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                counter++;
            }
        }
        return counter;
    }
}