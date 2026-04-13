public class CallByRefString {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(duplicateString(s));
    }

    static String duplicateString(String src){
        src = src + src;
        return src;
    }
}
