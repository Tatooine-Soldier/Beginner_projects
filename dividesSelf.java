public boolean dividesSelf(int n) {
  boolean result = false;
  int first = n%10;
  int second = (n%100 - first)/10;
  if (n%first== 0 && n%second == 0) {
    result = true;
  } return result;
}
