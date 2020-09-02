def end_other(a, b):  #takes 2 strings, returns true if one string is the ending of the other
  outcome = False
  a = a.lower()       #make this function case-unsensitive
  b = b.lower()
  if len(a) > len(b):        #need this or there will be indexing errors
    if a[len(a)-len(b):len(a)] == b:   #if ending of a == b
      outcome = True
  elif len(b) > len(a):      #need this or there will be indexing errors
    if b[len(b)-len(a):len(b)] == a:   #if ending of b == a
      outcome = True
  elif b == a:
    outcome = True
  return  outcome
