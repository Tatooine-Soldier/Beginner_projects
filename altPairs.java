public String altPairs(String str) {
  String result = "";
  if (str.length() != 1) {
    if (str.length() >= 2) {
      result += str.substring(0,2);
      if (str.length() >= 6) {
        result += str.substring(4,6);
        if (str.length() >= 10) {
          result += str.substring(8,10);
          if (str.length() >= 14) {
            result += str.substring(12,14);
          }
        }
      }
    }
  } else {
    result = str;
  }return result;
}
