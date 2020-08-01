public int[] biggerTwo(int[] a, int[] b) {
  int [] result = {};
  int asum = 0;
  int bsum = 0;
  for (int i = 0; i < a.length; i++) {
    asum += a[i];
    bsum += b[i];
  }
  if (asum> bsum) {
    result = a;
  } else if (bsum > asum) {
    result = b;
  } else {
    result = a;
  }return result;
}
