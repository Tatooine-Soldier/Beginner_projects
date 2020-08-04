public boolean noTriples(int[] nums) {
  boolean result = true;
  for (int i =0; i < nums.length-1; i++) {
    if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) {
      result = false;
    }
  } return result;
}
