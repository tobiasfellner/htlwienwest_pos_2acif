import java.util.Scanner;

public class Forloop {
    public static void main(String[] args) {
        // i=i+1 == i++ == i+=1
//        for(int i = 0; i < 10;i+=2){
//            System.out.println(i);
//        }
//
//        for(int i=100; i >= 0; i--){
//            System.out.println(i);
//        }

        System.out.println("======== kleines 1*1");
        System.out.println("Größe eingeben: ");
        Scanner scanner = new Scanner(System.in);
        int upperBound = scanner.nextInt();
        scanner.close();

        for(int i = 1; i <= upperBound; i++){
            for(int j = 1; j <= upperBound; j++){
                System.out.print(j*i);
                if(j < upperBound){
                    System.out.print("\t-\t");
                }
            }
            System.out.println();
        }

    }

}
