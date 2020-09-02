def count_code(str):   #takes a string, counts how many times 'code' appears
  count = 0            #but the 'd' in 'code' can be any letter
  i = 0
  while i < len(str):
    if str[i:i+2] == "co":
      if str[i+3:i+4] == "e":
        count += 1
    i += 1
  return count
