public boolean sameEnds(int[] nums, int len) { //takes array, int and returns true if end
  boolean result = false;                      //of group n length are same
  int dindex;
  if (nums.length > 0) {
    if (len == 0) {             //len as 0 causes ind err with next if so do this
      dindex = nums[0];
    } else {
      dindex = nums[len-1];     //get the value of index of the len in the array
    } 
    if (dindex == nums[nums.length-1]) {   //if 1st ending matches last ending then true
      result = true;
    }
  } else {                      //empty array is true by default 
    result = true;
  }
  return result;
}
