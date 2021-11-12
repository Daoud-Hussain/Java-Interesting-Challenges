/*
Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by
exactly one space. Also display the number of leap years in this period.
*/

import java.util.*;
public class leapYearInGivenRange{
	public static void main(String[] args) {
		
		//Count variable will count the number of leap years b/w 101 and 2100
		int count = 0;

		//You can uncomment the following code if you want to input the range from user
		/*
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the starting range: ");
		int startingRange = input.nextInt();
		
		System.out.print("Enter the ending range: ");
		int endingRange = input.nextInt(); 
		for (int i=startingRange; i<=endingRange;i++){
		*/

		//Applying loops in range of 101 and 2100
		for (int i=101; i<=2100;i++){
			
			//Condition for LEap year
			if ((i%4==0) && (i%400==0 || i%100!= 0)){
				System.out.print(i+ " ");
				count= count + 1;

				//Printing new line after 10 leap years
				if (count%10==0){
					System.out.printf("\n");
				}	
			}
		}
	//Displying total number of leap years between 101 - 2100
		System.out.println("Total leap years are: " + count);
	}
}
