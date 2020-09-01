def rotate_left3(nums):   #rotates each index one left 
  outcome = []
  i = 1
  while i < 3:           #taking a list of len 3, add the last two indexes to new list
    outcome.append(nums[i])
    i += 1
  outcome.append(nums[0])       #then add the first element to the end
  return outcome
