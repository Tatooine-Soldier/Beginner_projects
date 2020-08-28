public String repeatFront(String str, int n) {       //takes str and int and returns a new str made up of its first n characters as decreasing substring sizes
  String result = "";                                // eg. "Ice cream" ==> "IcI"
  String front = str.substring(0,n);                  
  for (int i = n; i > 0; i--) {
    result += str.substring(0,i);
  } return result;
}
