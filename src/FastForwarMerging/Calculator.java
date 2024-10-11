package FastForwarMerging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator 
{
	static int addition(int num1,int num2)
	{
		return num1+num2;
	}

public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);
    int num1 = 0, num2 = 0;
    boolean validInput = false;

    // Input validation for two integers
    while (!validInput) {
        try {
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();

            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();

            validInput = true; // If both inputs are valid, exit loop
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid integers.");
            scanner.next(); // Clear the invalid input
        }
    }

    // Perform operations
    addition(num1, num2);
    mult(num1,num2)

    scanner.close();

}
}
