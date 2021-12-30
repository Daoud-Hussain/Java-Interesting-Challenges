/**
Write a Menu Driven JAVA program that creates a two-dimensional array/Matrix of size n X m
where n represent the students and m represent the subjects and initialize it with user. The
program should do following Tasks using Menu, the menu operations are implemented using
methods:
a) Total_Marks: Calculates total/sum of the values in the specified row (student).
b) Avg_Subject: Calculates Average of the values in the specified column (subject).
c) Stud_Highest: Finds highest value in the specified row of the array and return
that subject name.
d) Stud_Lowest: Finds lowest value in the specified row of the array and return that
subject name.

*/

import java.util.Scanner;
public class MultiDimensionalArrayUsingMethods {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students (row): ");
        int noOfStudents = input.nextInt();
        System.out.print("Enter the number of subjects (column): ");
        int noOfSubjects = input.nextInt();
        String[][] studentSubjectArray = new String[noOfStudents][noOfSubjects];
        int[][] rollNoMarksArray = new int[noOfStudents][noOfSubjects];

        //Student marks int array input
        for(int i = 0; i < rollNoMarksArray.length; i++){
            for (int j = 0; j<rollNoMarksArray[i].length ;j++ ) {
                System.out.printf("Enter marks for (%d,%d) index:  ", i,j);
                int valueOfIntArray = input.nextInt();
                rollNoMarksArray[i][j] = valueOfIntArray;
            }
        }
        System.out.println();

        //Student subject string array input
        input.nextLine();
        for(int i = 0; i < studentSubjectArray.length; i++){
            for (int j = 0; j<studentSubjectArray[i].length ;j++ ) {
                System.out.printf("Enter subject names for (%d,%d) index:  ", i,j);
                String valueOfStringArray = input.nextLine();
                studentSubjectArray[i][j] = valueOfStringArray;
            }
        }

        
        totalMarks(rollNoMarksArray ,noOfSubjects);
        averageMarks(rollNoMarksArray ,noOfStudents);
        highestMarks(rollNoMarksArray, studentSubjectArray, noOfSubjects, noOfStudents);
        lowestMarks(rollNoMarksArray, studentSubjectArray, noOfSubjects, noOfStudents);


    }


    //Method to Calculates total/sum of the values in the specified row (student). (PART-A)
    public static void totalMarks(int[][] rollNoMarksArray , int students) {
            boolean flag = true;
            Scanner input = new Scanner(System.in);
            while(flag){
                System.out.printf("\n------------------------PART-A--------------------------");
                System.out.printf("\nWhich index row of array you want to calculate total marks: ");
                int userChoice = input.nextInt();
                int totalmarks = 0;
                if(userChoice < students){
                    for(int i=userChoice; i<userChoice+1; i++){
                        for(int j=0; j<rollNoMarksArray[i].length; j++){
                            totalmarks += rollNoMarksArray[i][j];
                            flag = false;
                        }
                    }
                    System.out.printf("Total marks for row of %d are: %d" , userChoice, totalmarks);

                }
                else{
                    System.out.println("Invalid input try again! ");
                }
            }
            
    }


    //Method to Calculates Average of the values in the specified column (subject). (PART-B)
    public static void averageMarks(int[][] rollNoMarksArray , int students) {
            boolean flag = true;
            Scanner input = new Scanner(System.in);
            while(flag){
                System.out.printf("\n------------------------PART-B--------------------------");
                System.out.printf("\nWhich index column of array you want to calculate average marks: ");
                int userChoice = input.nextInt();
                int sum = 0;
                if(userChoice < students){
                    for(int i=0; i<rollNoMarksArray.length; i++){
                        for(int j=userChoice; j<userChoice+1; j++){
                            sum += rollNoMarksArray[i][j];
                            flag = false;
                        }
                    }
                    int avgMarks = sum / students;
                    System.out.printf("Average marks for column of %d are: %d" , userChoice, avgMarks);

                }
                else{
                    System.out.println("Invalid input try again! ");
                }
            }
            
    }



    //Method to Finds highest value in the specified row of the array and return that subject name. (PART-C)
    public static void highestMarks(int[][] rollNoMarksArray , String[][] studentSubjectArray, int students, int subjects) {
            boolean flag = true; 
            Scanner input = new Scanner(System.in);
            while(flag){
                System.out.printf("\n------------------------PART-C--------------------------");
                System.out.printf("\nWhich row index you want to calculate highest marks: ");
                int userChoice = input.nextInt();
                int max = 0, rowIndex = 0, colIndex = 0;
                if(userChoice < students){
                    for(int i=userChoice; i< userChoice+1; i++){
                        for(int j=0; j<rollNoMarksArray[i].length; j++){
                            if (rollNoMarksArray[i][j] > max) {
                                max = rollNoMarksArray[i][j];
                                rowIndex = i;
                                colIndex = j;
                            }
                            flag = false;
                        }
                    }
                    
                    System.out.printf("Highest marks in row of %d is of %s " , userChoice, studentSubjectArray[rowIndex][colIndex]);

                }
                else{
                    System.out.println("Invalid input try again! ");
                }
            }   
    }

   

    //Method to Finds lowest value in the specified row of the array and return that subject name. (PART-D)
    public static void lowestMarks(int[][] rollNoMarksArray , String[][] studentSubjectArray, int students, int subjects) {
            boolean flag = true;
            Scanner input = new Scanner(System.in);
            while(flag){
                System.out.printf("\n------------------------PART-D--------------------------");
                System.out.printf("\nWhich row index you want to calculate lowest marks: ");
                int userChoice = input.nextInt();
                int min = rollNoMarksArray[students-1][subjects-1], rowIndex = 0, colIndex = 0;
                if(userChoice < students){
                    for(int i=userChoice; i<userChoice+1; i++){
                        for(int j=0; j<rollNoMarksArray[i].length; j++){
                            if (rollNoMarksArray[i][j] < min) {
                                min = rollNoMarksArray[i][j];
                                rowIndex = i;
                                colIndex = j;
                            }
                            flag = false;
                        }
                    }
                    
                    System.out.printf("Lowest marks in row of %d is of %s " , userChoice, studentSubjectArray[rowIndex][colIndex]);

                }
                else{
                    System.out.println("Invalid input try again! ");
                }
            }   
    }
}
