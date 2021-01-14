public String frontTimes(String str, int n) {  //Q. string of 1st 3 chars n times
  String result = "";              // return variable
  int i;
  if (str.length() >= 3) {         //strings >= 3
    String firstThree = str.substring(0,3);       //get the first 3 characters
    for (i=0; i<n; i++) {
      result += firstThree;         //create the new string which is the first 3 n times 
    }
  } else if (str.length() < 3 && str.length() > 0) {     // if less than len 3
    String addi = str.substring(0,str.length());      //get the whole string
    for (i=0; i<n; i++) { 
      result += addi;              //create the new string
    }
  } 
  return result;
}
