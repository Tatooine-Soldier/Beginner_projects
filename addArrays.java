public int[] plusTwo(int[] a, int[] b) {   //put two 2 element arrays together in one
  int[] result = {3,3,3,3};     //random initialise
  int j = 2;                    //second counter for the 2nd half of the array
  for (int i=0; i < 2; i++) {   //use one loop to solve both 
    result[i] = a[i];           //first list match the indexes
    result[j] = b[i];           //second list, j is for the last indexes(2,3)
    j++;
  } return result;
}
