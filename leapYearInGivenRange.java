/*
Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by
exactly one space. Also display the number of leap years in this period.
*/


public class leapYearInGivenRange{
	public static void main(String[] args) {

		//Count variable will count the number of leap years b/w 101 and 2100
		int count = 0;

		//Applying loops in range of 101 and 2100
		//You can take the inputs from user if you want
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
