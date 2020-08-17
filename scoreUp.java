public int scoreUp(String[] key, String[] answers) {
  int count = 0;
  for (int i = 0; i < answers.length; i++) {
    if (key[i].equals(answers[i])) {                  //Takes two arrays, the first with 4 options and the other with 4 answers 
      count += 4;                                     //If the answer in right index then count goes up 4, if wrong go down 1 and 0 if "?"
    } else if (answers[i].equals("?")){
      count += 0;
    } else {
      count -= 1;
    } 
  } return count;
}
