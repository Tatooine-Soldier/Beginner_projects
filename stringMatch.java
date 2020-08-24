public int stringMatch(String a, String b) {
  int count = 0;
  if (b.length() >= a.length()) {                       //if b is longer than a, otherwise index length problems would arise
    for (int i = 0; i < a.length()-1; i++) {
      if (a.substring(i,i+2).equals(b.substring(i,i+2))) {   //if substrings in same index
        count+=1;
      }
    }
  } else if (a.length() > b.length()) {
    for (int i = 0; i < b.length()-1; i++) {
      if (b.substring(i,i+2).equals(a.substring(i,i+2))) {
        count+=1;
      }
    }
  }
 return count;
}
