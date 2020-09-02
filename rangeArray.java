public int[] fizzArray3(int start, int end) {     //takes a start and end int, creates new array with all nums in between both ints
  int[] result;
  result = new int[end-start];                  //list length 
  if (result.length >= 1) {
    result[0] = start;                         //start int is always included
    for (int i = 1; i < result.length; i++) {
      result[i] = start + i;                  //each index added is just start plus that index
    }
  } return result;
}
