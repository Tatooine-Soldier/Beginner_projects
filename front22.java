public String front22(String str) {
  String result = "";
  if (str.length() > 2) {
    String front = str.substring(0,2);
    result = front + str + front;
  } else {
    String shortd = str.substring(0,str.length());
    result = shortd + str + shortd;
  } return result;
}
