public int[] makeLast(int[] nums) {
  int[] result;
  result = new int[2*nums.length];
  for (int i = 0; i < nums.length-2; i++) {
    result[i] = 0;
  } result[result.length-1] = nums[nums.length-1];
  return result;
}
