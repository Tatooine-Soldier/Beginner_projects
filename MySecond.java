import java.util.Arrays;
import java.util.Scanner;

public class MySecond {
  public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);

    System.out.println("Enter sith name and then real name below: ");

    // String input
    String sithname = myObj.nextLine();

    // Numerical input
    String realname = myObj.nextLine();

    // Output input by user
    System.out.println("Welcome " + realname + " or should I call you " + sithname + ".");;
   }

}