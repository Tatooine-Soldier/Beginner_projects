public boolean haveThree(int[] nums) {      //true if there are 3 three's not next eachother
  boolean result = false;
  int count = 0;
  for (int i = 0; i < nums.length-1; i = i+1) {
    if (nums[i] == 3) {                     //if 3 is in the array
      if (nums[i+1] != 3) {                 //if the next num isn't a 3
        count += 1;
      }
    }
  } if (count == 3 || (count ==2 && nums[nums.length-1] == 3)) {  //last 3 isn't counted so if there are two and last one is 3 then true
    result = true;
  }
  return result;
}
