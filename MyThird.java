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
          }


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

	
		int dnum = 3 > 5 ? 10 : 5;
		System.out.println(dnum);
		dnum = 3 == 5 ? 10 : 5;
		System.out.println(dnum);
		dnum = 3< 5 ? 10 : 5;
		System.out.println(dnum);



	//Grade system using switch
	int[] dlist = {1, 2, 3, 4};	    //using a loop so i can test all cases :)
	for (int i = 0; i < dlist.length; i ++) {
	 System.out.println("Enter your grade below: ");
         String myGrade = myObj.nextLine().toUpperCase();

		switch (myGrade) {
			case "A+":
			case "A":
				System.out.println("Excellent!");
				break;
			case "B": 
				System.out.println("Good work");
				break;
			case "C": 
				System.out.println("Keep going");
				break;
			default: 
				System.out.println("FAIL stupid cunt");
				break;
		}
	  }

	//enhanced for loop technique
	int[] myList = {20, 40, 50, 60};
	for (int item : myList) {
		System.out.println(item + 1);
	}

	//simple counter
	int counter = 1;
	while (counter < 21) {
		System.out.println("Counter is " + counter);
		counter = counter + 4;
	}

	//do-while loop, always executes the do part at least once
	int counter = 10;
	do {
		System.out.println("Printing once");
		counter--;
	}while (counter>0);


	//break segment in loop
	for (int i = 0; i < 10; i++) {
		System.out.println("i = " + i);
		if (i == 2) {
			break;
		}
	}*/

	//continue in loop
	for (int j = 0; j < 10; j++) {
		System.out.println("j = " + j);
		if (j == 2 || j == 6) {
			continue;
		}
		System.out.println("Printing");
	}
	

	


  }
}