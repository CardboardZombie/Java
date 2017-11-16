import java.util.Scanner;
/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
This Program is for Day 4 Lab 1
*/
public class MyInput
{
    public static void main(String args[]) 
    {
		Scanner myScan = new Scanner(System.in); // creates a scanner object, links it to the input device
		int n1, n2; // declare an int variable which will hold the number entered by the user	    

		System.out.println("Enter 1st Number:  "); // ask the user to enter a number
		n1 = myScan.nextInt();  // uses the nextInt() method call to obtain an int value from the user.
		
		System.out.println("Enter 2nd Number:  "); // ask the user to enter a number
		n2 = myScan.nextInt();  // uses the nextInt() method call to obtain an int value from the user.

		System.out.println(n1+" + "+n2+" = " + (n1+n2)); // tell the user what s/he entered 
		System.out.println(n1+" x "+n2+" = " + (n1*n2)); // tell the user what s/he entered 
    }
}