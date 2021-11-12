/*
Write a program that prompts the user to enter two strings and reports whether the second string
is a substring of the first string
Enter string s1: ABCD
Enter string s2: BC
BC is a substring of ABCD

*/

//Importing Java Practice
import java.util.*;
public class checkSubstring{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first string: ");
		String firstString = input.nextLine();

		System.out.print("Enter Second string: ");
		String secondString = input.nextLine();

		if (firstString.indexOf(secondString) != -1){
			System.out.print(secondString + " is the substring of " + firstString);
		}
		else{
			System.out.print(secondString + " is not the substring of " + firstString);
		}
	}
}
