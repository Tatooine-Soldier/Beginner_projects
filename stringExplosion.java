public String stringSplosion(String str) {
  String result = str.substring(0,1);
  if (str.length() > 0) {
    for (int i = 1; i < str.length(); i++ ) {
      result += str.substring(0,i+1);
    }
  } return result;
}
