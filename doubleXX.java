boolean doubleX(String str) {
  boolean result = false;
  for (int i = 0; i < str.length()-1; i++) {
    int j = i + 1;
    if (str.substring(i,j+1).equals("xx")) {
      result = true;
    } break;
  } return result;
}
