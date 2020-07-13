public class reverseString {
    public static void main(String[] args) {
        myMethod("Java");
    }

    static void myMethod(String s) {
        String result = "";
        int n = s.length();
        for (int i = s.length(); i > 0; i--) {
            result += s.charAt(i-1);
        } System.out.println(result);
    }
}





