public int sumHeights2(int[] heights, int start, int end) {  //takes array with two indexes and return the difference from start to end, but if 
  int result = 0;                                           //if the value increases, it doubles
  for (int i = start; i < end; i++) {
    if (heights[i]>heights[i+1]) {                //if first index > next index
      result += heights[i]-heights[i+1];          //add the difference to variable
    } else if (heights[i]<heights[i+1]) {         //if the next index > first index
      result += (heights[i+1]-heights[i])*2;      //get the difference then multiply by 2
    }
  } return result;
}
