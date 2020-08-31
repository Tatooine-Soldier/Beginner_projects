public String repeatSeparator(String word, String sep, int count) {
  String joined = word + sep;             //create the base
  String result = "";
  for (int i = 0; i < count; i++) {
    if (i == count-1) {
      joined = joined.substring(0,word.length());    //on last loop don't add sep
    }
    result += joined;
  }
  return result;
}
