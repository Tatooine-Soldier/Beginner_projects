public int[] maxEnd3(int[] nums) {
  int[] result;
  result = new int[3];
  for (int i = 0; i < nums.length; i++) {
    if (nums[0] > nums[nums.length-1]) {
      result[i] = nums[0];
    } else {
      result[i] = nums[nums.length-1];
    }
  }return result;
}
