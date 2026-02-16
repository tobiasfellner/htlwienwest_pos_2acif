public class Lab9 {
    public static void main(String[] args) {
        int i = 3;
        while(i < 20) {
            if (i< 12 && i %3 == 0)
                System.out.println(i);
            else if (i >12 && i %4 == 0)
                System.out.println(i);
            i += 1;
        }

    }
}
