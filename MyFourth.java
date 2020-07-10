import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;


public class MyFourth {
  public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);

	int[] dlist = {1,3,4,6,7};
	System.out.println("Enter a num: ");
	int myNum = myObj.nextInt();
	
	for (int item : dlist) {
	   if (item == myNum){
		System.out.println(myNum + " appears in the list at" + Arrays.binarySearch(dlist, myNum));
	   }else if (item != myNum){
		System.out.println("");
	   }
	} 


	int choice = 0;
	int[] myNums = {10,11,12,13};
	System.out.print("Please enter the index of the list: ");
	try {
		choice = myObj.nextInt();
		if (choice == ) {
			System.out.println("Pls enter a something");
		}
		System.out.printf("myNums[%d] = %d%n", choice, myNums[choice]);
	}catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Error. Index is invalid");
	}catch (InputMismatchException e) {
		System.out.println("Error. You did not eneter inte");
	}catch (Exception e) {
		System.out.printf(e.getMessage());
	}
		




  }
}