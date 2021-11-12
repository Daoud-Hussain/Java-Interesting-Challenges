/*
Write a program that prompts the user to enter a decimal integer and displays its corresponding
binary value. Don’t use Java’s Integer.toBinaryString(int) in this program.
*/


//Importing java package for input
import java.util.Scanner;
public class decimalToBinaryConverter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		//TAking input from user
		System.out.print("Enter a decimial interger: ");
		int deciamlValue = input.nextInt();
		/*
			Formula to convert decimal to binary
			Step 1: Divide the given decimal number by 2 and note down the remainder.
			Step 2: Now, divide the obtained quotient by 2, and note the remainder again.
			Step 3: Repeat the above steps until you get 0 as the quotient */

		String binaryValue = "";	
		for (int i = deciamlValue; i > 0; i /= 2) {
			binaryValue = (i % 2) + binaryValue; 
		}

		//Displying outputs
		System.out.println(
			"The binary value of the  " + deciamlValue + " is: " + binaryValue);
	}
}