def last2(str):
  i = 0
  count = 0
  if (len(str) > 0):
    while i < len(str):
      if str[i:i+2] == str[len(str)-2:len(str)]:     #if substring of length 2 equals the last 2 
        count += 1                                   #increment
      i += 1
  else:
    count += 1
  return count-1                                     #decrement once as an extra is added each time above
