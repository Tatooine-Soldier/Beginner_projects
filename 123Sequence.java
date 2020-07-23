public boolean array123(int[] nums) {
  boolean result = false;
  if (nums.length >= 3) {
    for (int i = 0; i < nums.length-1; i++) {
      if ((nums[i] == 1) && (nums[i+1] == 2) && (nums[i+2] == 3)) {
        result = true;
      }
    }
  } return result;
}
