def last2(str):
  count = 0
  if len(str) >= 1:       #if its len 0 then count is 0
    i = 0
    while i < len(str):
      if str[i:i+2] == str[len(str)-2:len(str)]:   #if a len2 substrr == last2 then increment count
        count += 1          
      i += 1     #must continue the loop
    count = count -1  #makes sure theres no extra count
  else: 
    count = 0
  return count
