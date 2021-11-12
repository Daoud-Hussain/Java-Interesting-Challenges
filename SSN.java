/*
Write a program that prompts the user to enter a Social Security number in the format DDD-DDDDDD,
where D is a digit. Your program should check whether the input is valid. Here are
sample runs:
Enter a SSN: 232-23-5435
232-23-5435 is a valid social security number
Enter a SSN: 23-23-5435
23-23-5435 is an invalid social security number
*/

//Importing Java Package
import java.util.*;
public class SSN{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number in the format DDD-DD-DDDD: ");
		String SSD = input.nextLine();

		//Applying Conditions
		if (SSD.length()==11){
			if (SSD.charAt(3)=='-'){
				if (SSD.charAt(6)=='-'){
					System.out.print("This is a valid SSN. ");
					
				}
				else{
						System.out.print("This is not a valid SSN");
					}
			}
			else{
			System.out.print("This is not a valid SSN");
			}
		}
		else{
			System.out.print("This is not a valid SSN");
		}
	}
}