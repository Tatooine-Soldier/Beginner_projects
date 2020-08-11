public int sum13(int[] nums) {
  int result = 0;
  if (nums.length >= 1) {
    for (int i =0; i < nums.length; i++) {
      if (nums[i] != 13) {
        result += nums[i];
      } else {
        break;
      }
    }
  } return result;
}
