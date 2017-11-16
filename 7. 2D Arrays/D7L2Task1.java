/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
Q1 from 2A && 2B (ie Do both Q1s)
+
Any 3 Questions from 2A | 2B

Day 7 Lab 2A - Question 1

In the main method of a program, 
write a piece of code that prints out the contents 
of an array to the screen. 
Then write a separate piece of code that adds 10 
to each element in this array. 
Under this write a third piece of code that prints
out the new contents of the array.

Use the array below:
 int [ ] numList = { 5, 6 , 3, 0 , 1 , 19, 22, 8 };
Note: You must use a for loop when writing this problem.


*/

public class D7L2Task1
{
	public static void main(String[] args)
	{
		int[] a = { 5, 6 , 3, 0 , 1 , 19, 22, 8 };
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
			a[i] += 10;
		}
		System.out.println("*****New Values Added****");
		for(int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}
}