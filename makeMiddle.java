public int[] makeMiddle(int[] nums) {
  int[] result = {6,9};
  int findex = nums[(nums.length/2)-1];
  int sindex = nums[(nums.length/2)];
  result[0] = findex;
  result[1] = sindex;
  return result;
}
