int countXX(String str) {                                                //Counts the amount "xx" in a string, will return 2 if overlap of one extra x
  int count = 0;
  for (int i = 0; i < str.length()-1; i++) {                
    if (str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {                    
      count += 1;
    }
  } return count;
}
