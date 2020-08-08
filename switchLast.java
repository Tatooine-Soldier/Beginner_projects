public int[] swapEnds(int[] nums) {
  int[] result;
  result = new int[nums.length];
  for (int i = 0; i < nums.length; i++) {
    result[i] = nums[i];
  }
  result[0] = nums[nums.length-1];
  result[result.length-1] = nums[0];
  return result;
}
