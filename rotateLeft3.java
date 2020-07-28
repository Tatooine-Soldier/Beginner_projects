public int[] rotateLeft3(int[] nums) {
  int[] result = {};
  int middle = nums[2];
  nums[nums.length-1] = nums[0];
  nums[0] = nums[1];
  nums[1] = middle;
  result = nums;
  return result;
}
