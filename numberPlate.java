/*
Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a
program to generate a plate number.
*/

//Importing Java random package to generate random numbers
import java.util.Random;

public class numberPlate{
	public static void main(String[] args) {

		//Creating new object to create random number
		Random random = new Random();
		System.out.print("The number plate is: ");

		//Displaying alphabets of plate number
		for (int i = 0; i<3; i++){
			char randomCharacter = (char)(random.nextInt(26)+ 'A');
			System.out.print(randomCharacter);}
		
		//Displaying Numbers of plate
		for (int i = 0; i<=3; i++){
			int randomNumber = random.nextInt(9);
			System.out.print(randomNumber);}
	}
}
	
