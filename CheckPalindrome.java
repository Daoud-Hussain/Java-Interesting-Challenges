/*
Write a program that checks whether a string is a palindrome.A string is a palindrome if it reads the same forward and backward.
The words mom,  dad and noon for instance, are all palindromes.
Sample run:
Enter a string: noon
noon is a palindrome
Enter a string: moon
moon is not a palindrome
*/

//Importing Java package to use scanner class
import java.util.*;

public class CheckPalindrome{
	public static void main(String[] args) {

		//Creating new object to take input
		Scanner input= new Scanner(System.in);
		System.out.print("Enter a string: ");
		String myString = input.nextLine();

		String reverseString = "";
		//Accessing the last item for reverse string
		for(int i=myString.length()-1;i>=0 ; i--){

			//Reversing the input string
			char ch = myString.charAt(i);
			reverseString = reverseString + ch;
		}
		
		//Displaying outputs
		System.out.println(myString);
		System.out.println(reverseString);

		//Checking for palindrome
		if(myString.compareTo(reverseString)==0){
		System.out.print("It is a Palindrome! ");}
		else{
		System.out.print("It is not a Palindrome! ");}

	}
}
