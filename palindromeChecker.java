public class palindromeChecker {
    public static void main(String[] args) {
        String word = "aba";
        String result = "";
        boolean outcome = false;
        if (word.length() != 1) {
            for (int i = word.length(); i > 0; i--){
            result += word.charAt(i-1);
            }
            if (result.equals(word)) {
            outcome = true;
            }
        } else {
            outcome = true;
            
        }
        System.out.println(outcome);
    }
}