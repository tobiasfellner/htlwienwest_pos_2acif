public class Addition {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int additionsResult = add(a, b);
        System.out.println(additionsResult);
        int additionResult3 = add(10, 20, 30);
        System.out.println(additionResult3);

        System.out.println(addOnlyPositive(5, -100));
    }

    /// int add (int, int)
    static int add(int x, int y){
        int sum = x + y;
        return sum;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static int addOnlyPositive(int a, int b){
        int sum = getPositiveOrZero(a) + getPositiveOrZero(b);
        return sum;
    }

    static int getPositiveOrZero(int a){
        if(a > 0){
            return a;
        }
        return 0;
    }
}