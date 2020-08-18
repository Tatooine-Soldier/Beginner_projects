import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int myInt = input.nextInt();
        System.out.printf("You entered %d.%n%n", myInt);

        System.out.print("Enter a float: ");
        Double myDoub = input.nextDouble();
        System.out.printf("You entered %.2f", myDoub);

        System.out.print("Enter a word: ");
        String myString = input.nextLine();
        System.out.printf("You entered \"%s\".%n%n", myString);
    }
}