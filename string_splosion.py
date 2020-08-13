def string_splosion(str):
  result = ""
  i = 0
  while i < len(str)+1:
    result += str[:i]
    i += 1
  return result  
