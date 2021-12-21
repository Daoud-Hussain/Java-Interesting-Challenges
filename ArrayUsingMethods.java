/*
Write a Menu Driven JAVA program that creates a string array by taking input from user and
perform following tasks by displaying menu to user, the menu operations are implemented using
methods:
a) Calculate length of string.
b) Count number of words in string.
c) Check a string is palindrome or not.
d) Find a word within the array. If found display its starting position.
e) Convert a string in lowercase.
f) Convert a string in uppercase.
*/


import java.util.*;
public class ArrayUsingMethods {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int sizeArray = input.nextInt();
        input.nextLine();
        String[] menuArray = new String[sizeArray];
        for(int i=0; i<sizeArray; i++){
            System.out.print("Enter your string elements: ");
            String valueOfArray = input.nextLine();
            menuArray[i] = valueOfArray;

        }

        //Calling all required methods one by one
        lengthOfArray(menuArray,sizeArray);
        wordCount(menuArray,sizeArray);
        checkPalindrome(menuArray,sizeArray);
        wordCheck(menuArray,sizeArray);
        stringToLowerCase(menuArray,sizeArray);
        stringToUpperCase(menuArray,sizeArray);

    }

    //Method to Check a string is palindrome or not. (PART-C)
    static void lengthOfArray(String[] menuArray ,int arraySize){
            Scanner input = new Scanner(System.in);
            System.out.print("Which string length you want to calculate: ");
            int userChoice = input.nextInt();
            if(userChoice >= arraySize){
                System.out.println("Invalid Choice! ");
            }
            else{
                System.out.println("The length of the string is: " + menuArray[userChoice].length());
            }
    }
        
        
    //Method to Find a word within the array. (PART-D)   
    static void wordCount(String[] menuArray ,int arraySize){
        Scanner input = new Scanner(System.in);
        System.out.print("Which string's words you want to count: ");
        int userChoice = input.nextInt();
        if(userChoice >= arraySize){
            System.out.println("Invalid Choice! ");
        }
        else{
            String [] splitArray = menuArray[userChoice].split(" ");
            int numberOfWords = splitArray.length;
            System.out.printf("Number of words in string of index %d is %d: \n", userChoice , numberOfWords);
        }
    }


    //Method to Count number of words in string. (PART-B)   
    static void checkPalindrome(String[] menuArray ,int arraySize){
            Scanner input = new Scanner(System.in);
            System.out.print("Which string index you want to check palindrome: ");
            int userChoice = input.nextInt();
            if(userChoice >= arraySize){
                System.out.println("Invalid Choice! ");
            }
            else{
                //Calculating reverse string
                String reverseString = "";
                for(int i = menuArray[userChoice].length()-1; i >= 0; i-- ){
                    char ch = menuArray[userChoice].charAt(i);
                    reverseString = reverseString + ch;
                }
            
                if(menuArray[userChoice].equalsIgnoreCase(reverseString)){
                    System.out.printf("The string %s is a palindrome! \n" , menuArray[userChoice]);
                }
                else{
                    System.out.printf("The string %s is not a palindrome! \n" , menuArray[userChoice]);

                }
            }

    }


    //Method to Count number of words in string. (PART-B)   
    static void wordCheck(String[] menuArray, int arraySize){
        Scanner input = new Scanner(System.in);
        System.out.print("Which word you want to check in given string: ");
        String userChoice = input.nextLine();
        boolean flag = false;
        int positionIndex = 0;
        for(int i=0; i<arraySize; i++){
            if(menuArray[i].equalsIgnoreCase(userChoice)){
                positionIndex = i;
                flag = true;
            }
            
            
        }
        if(flag){
                System.out.println("Yes, "+userChoice + " is present in the given string array and is on string of index: " + positionIndex);
            }
        else{
            System.out.println("No, "+ userChoice + " is not present in the given string");
        }

    }



    //Method to Convert a string in lowercase. (PART-E)  
    static void stringToLowerCase(String[] menuArray, int arraySize){
        Scanner input = new Scanner(System.in);

        //Converting specific string into lower case
          System.out.print("Which index string you want to change in lower case: ");
          int userChoice = input.nextInt();
          if(userChoice >= arraySize){
             System.out.println("Invalid Choice! ");
          }
          else{
             System.out.println("String in lower case is: " + menuArray[userChoice].toLowerCase());
          }
    }


    //Method to Convert a string in uppercase. (PART-F)   
    static void stringToUpperCase(String[] menuArray, int arraySize){
        Scanner input = new Scanner(System.in);

        //Converting specific string into lower case
          System.out.print("Which index string you want to change in upper case: ");
          int userChoice = input.nextInt();
          if(userChoice >= arraySize){
             System.out.println("Invalid Choice! ");
          }
          else{
             System.out.println("String in lower case is: " + menuArray[userChoice].toUpperCase());
          }
    }

}
