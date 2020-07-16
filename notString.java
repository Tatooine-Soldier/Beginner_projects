public class notString {
    public String notString(String str) {
        String result = "";
        String check = str.substring(0,3);
        if (str.length() != 0) {
        if (check.equals("not")) {
            result += str;
        } else if(!check.equals("not")) {
            result = "not " + str;
        } else {
            result = "not " + str;
        }return result;
    }
}