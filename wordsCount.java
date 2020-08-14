public int wordsCount(String[] words, int len) {
  int result = 0;
  for (int i = 0; i < words.length; i++) {
    if (words[i].length() == len) {
      result += 1;
    }
  } return result;
}
