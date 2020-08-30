public int userCompare(String aName, String bName) {
  int result = 0;                       //takes two len 2 strings, returns 1 if 
  String together = aName + bName;      //a is before b, -1 if b before, equal 0
  char darray[] = together.toCharArray();      //puts the string in an array
  Arrays.sort(darray);                         //sorts it
  if (aName != bName) {
    for (int i = 0; i < darray.length; i++) {  
      if (darray[i] == together.charAt(0)) {      //returns 1 if a is before b
        result = 1;
      } else if (darray[i] == together.charAt(2)) {
        result = -1;
      }
    } 
  }
  return result;
}
