def count_hi(str):       #counts number if "hi" in the string
  count = 0
  i = 0
  while i < len(str):
    if str[i:i+2] == "hi":
      count += 1
    i += 1
  return count
