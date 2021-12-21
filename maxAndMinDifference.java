/*
Consider an integer array, the number of elements in which is determined by the user. The
elements are also taken as input from the user. Write a program to find those pairs of elements
that have the maximum and minimum difference among all element pairs.
*/

import java.util.*;
public class maxAndMinDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int size = input.nextInt();
        int [] array = new int[size];

        //Taking array elements from user
        for(int i = 0; i<array.length;i++){
            System.out.print("Enter element at index "+i+ ": ");
            array[i] = input.nextInt();
        }

        //Calling sort and difference method to sort the array and find the maximum and minimum difference
        sort(array);
        difference(array);
    }

    //Sort method to sort the given array
    static void sort(int [] array){
        for (int i = 0; i< array.length; i++){
            for(int j= 1+i; j<array.length; j++){
                if (array[i]>array[j]){
                    int temp;
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //Calculating difference for maximum and minimum difference pairs
    static void difference(int [] array){
        int maxValue = array[array.length-1];
        int minValue = array[0];
        int secondMinValue = array[1];
        int maxDifference = maxValue-minValue;
        int minDifference = secondMinValue-minValue;
        System.out.printf("The pair with maximum difference  is (%d,%d) with " +
                "difference %d units \n",maxValue,minValue,maxDifference);
        System.out.printf("The pair with minimum difference is (%d,%d) with " +
                "difference %d units \n",secondMinValue,minValue,minDifference);


    }
}
