public class VoidMethoden {
    public static void main(String[] args) {
        countdown(10);
        countdown(100);
    }
    static void countdown(int start){
        for(int i = start; i > 0; i--){
            System.out.println(i);
        }
    }
}