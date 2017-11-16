/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
 The problem below is an "idiom" or common pattern of programming that you 
 must know and understand. Try and do this yourself without 
 intervention from the teaching team 

 How do you swap the contents of these variables? 
 After you have completed this code, num1 will contain 6 and num2 will 
 contain 10

 This code will appear in your main method or in the main code block 
*/

public class SwappingVariablesDemo
{
	public static void main(String[] args)
	{
		System.out.println();
		int n1 = 10;
		int n2 = 6;
		int temp;
		// Put code here to print out the values
		System.out.println("N1: "+n1);
		System.out.println("N2: "+n2);
		// Put code to swap the values
		temp = n1;
		n1 = n2;
		n2 = temp;
		System.out.println("Values swapped.");
		// Put code here to print out the new values
		System.out.println("N1: "+n1);
		System.out.println("N2: "+n2);
	}
}

	