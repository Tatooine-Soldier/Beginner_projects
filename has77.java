public boolean has77(int[] nums) {             //takes in a list and returns true if 77 init, 7's can be spaced out by one index in between
  boolean result = false; 
  for (int i = 0; i < nums.length-1; i++) {
    if (nums[i] == 7) {
      if (nums[i+1] == 7) {                //the one directly afterwards
        result = true;
      } else if (nums[i+2] == 7) {         //the one which has an element between them
        result = true;
      }
    }
  } return result;
}
