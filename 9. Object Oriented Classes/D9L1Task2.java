/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	7/9/2017

Description:
This Program is for Day 9 Lab 1

Task:
In your main method of a program, 
write the code that will go through the array defined in
question 1 above and find the number 17. 

Use a boolean variable whose value will be set to true
if the number is found in the array otherwise it 
will be set to false

Input:

int [] numbers = {2, 10, 0, 5, 17, 8, 10, 23, 9};

Output:

17 is in the Array: true

*/

public class D9L1Task2
{
	public static void main(String[] args)
	{
		int [] numbers = {2, 10, 0, 5, 17, 8, 10, 23, 9};
		boolean search = searchArray(numbers, 17);
		System.out.println("17 is in the Array: "+search);
	}
	public static boolean searchArray(int[]a, int s)
	{
		boolean isFound = false;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == s){
				isFound = true;
				break;
			}
		}
		return isFound;
	}
}