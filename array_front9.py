def array_front9(nums):  #takes in int list and returns true if 9 in first 4 ind 
  i = 0
  result = False
  if (len(nums) > 4):    #if there will be more than the 4 indexes asked for
    while i < 4:         #use while loop to target those first 4 indexes
      if nums[i] == 9:
        result = True
      i += 1
  else:                  #if the list is smaller than 4 therefore ok to proceed
    while i < len(nums): 
      if nums[i] == 9:
        result = True
      i += 1
  return result
