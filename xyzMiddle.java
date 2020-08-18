  public boolean xyzMiddle(String str) {                     //checks if 'xyz' is in middle of the string, allowing one index either side
  boolean result = false;
  int front = (str.length()/2)-2;
  if (str.length() > 2) { 
    if (str.charAt(front) == 'x' || str.charAt(front+1) == 'x') {
      if (str.charAt(front+1) == 'y' || str.charAt(front+2) == 'y') {
        result = true;
      } 
    } 
  } return result;
}
