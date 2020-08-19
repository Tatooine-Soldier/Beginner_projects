public int sumHeights(int[] heights, int start, int end) {
  int result = 0;           
  for (int i = start; i < end; i++) {
    if (heights[i+1] > heights[i]) {
      result += heights[i+1] - heights[i]; 
    } else if (heights[i] > heights[i+1]) {
      result += heights[i] - heights[i+1];
    }
  } return result;
}
