/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	7/9/2017

Description:
This Program is for Day 9 Lab 1

Task:
In your main method declare an array as below and 
use a for loop to go through all elements or
slots of the array adding up all the values together.

Then adapt this code to create a method named 
addUpArray that returns an int value and takes
an int array as a parameter. 

This method will add up all the values of the array elements
and return this sum.

Input:

Use this method in you main method passing it the
array below and print out the result.
int [ ] numbers = {2, 10, 0, 5, 17, 8, 10, 23, 9};

Output:


*/

public class D9L1Task1
{
	public static void main(String[] args)
	{
		int [] numbers = {2, 10, 0, 5, 17, 8, 10, 23, 9};
		int total = addUpArray(numbers);
		System.out.println("Sum of the Array: "+total);
	}
	
	public static int addUpArray(int[] array)
	{
		int result = 0;
		for(int i = 0; i < array.length; i++)
		{
			result += array[i];
		}
		return result;
	}
}