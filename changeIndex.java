public String oneTwo(String str) {
  String result = "";                                     //takes the string in groups of 3, puts the last 2 indexes first while the first index is in last position
  if (str.length() > 2) {
    int j = 3;
    for (int i = 0; i < str.length()-2; i = i+3) {
      String word = str.substring(i+1,j);
      result += word;
      result += str.charAt(i);
      j += 3;
    }
  } return result;
}
