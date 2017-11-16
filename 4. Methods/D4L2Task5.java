/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
This Program is for Day 4 Lab 2
*/

public class D4L2Task5
{
	public static void main(String[] args)
	{
		
		int result = getFactorial(5);
		System.out.println("5!:\t"+result);
		
	}
	public static int getFactorial(int value)
	{
		int i = 1;
		int factorial = 1;
		while(i <= value)
		{
			factorial *= i;
			i++;
		}
		
		return factorial;
	}
}