import java.util.Arrays;
import java.util.Scanner;

public class MyThird {
  public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in); /*

	  System.out.println("\nPlease enter your age: ");
          int userAge = myObj.nextInt();
          if (userAge < 0 || userAge > 100) {
        	System.out.println("Invalid age \nMust be below 100 and above 0");
	  }else if (userAge < 18) {
	  	System.out.println("Oop you are still underage");
          }else {
		System.out.println("Great sign up here");
          }*/


	//Loop kind of like buzz fizz but can be stopped if 01 is entered 
	int[] dloop = {1,2,3};
	for (int i = 0; i < dloop.length; i++) {
	  System.out.println("\nPlease enter a number(eneter 01 to stop): ");
	  int aski = myObj.nextInt();
	  if (aski % 2 == 0 && aski % 5 == 0) {
		System.out.println("Big Win");
          }else if(aski % 2 == 0 && aski % 5 != 0) {
		System.out.println("Two");
	  }else if(aski % 2 != 0 && aski % 5 == 0) {
		System.out.println("Five");
	  }else if(aski == 01) {
		break;
	  }else {
		System.out.println("Something went wrong");
	  }
	}


  }
}