import java.util.Scanner;

public class AreaCalculation {
    public static void Main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welche Figur? (rechteck/kreis/dreieck)");
        String figur = scanner.nextLine();

        if(figur.equalsIgnoreCase( "rechteck")){
            System.out.println("Breite eingeben:");
            double width = Double.parseDouble(scanner.nextLine());

            System.out.println("Höhe eingeben:");
            double height = scanner.nextDouble();
            scanner.nextLine();

            double area = calcArea(width, height);
            System.out.printf("Fläche: %.2f", area);
        }else if(figur.equalsIgnoreCase("kreis")){
            System.out.println("Radius eingeben:");
            double radius = Double.parseDouble(scanner.nextLine());
            double area = calcArea(radius);
            System.out.printf("Fläche: %.2f", area);
        }else if(figur.equalsIgnoreCase("dreieck")){
            System.out.println("Grundlinie eingeben:");
            double baseline = Double.parseDouble(scanner.nextLine());

            System.out.println("Höhe eingeben:");
            double height = scanner.nextDouble();
            scanner.nextLine();

            double area = calcAreaTriangle(baseline, height);
            System.out.printf("Fläche: %.2f", area);
        }else {
            System.out.println("Falsche Eingabe");
        }
        scanner.close();
    }

    // für compiler:
    // double calcArea(double, double)
    public static double calcArea(double width, double height){
        double result = width * height;
        return result;
        //return width * height;
    }


    // für compiler:
    // double calcArea(double)
    public static double calcArea(double r) {
        return r*r*Math.PI;
    }

    public static double calcAreaTriangle(double baseline, double height) {
        return baseline * height / 2;
    }

    public static int calcAreaTriangle(int baseline, int height) {
        return baseline * height / 2;
    }


    }
