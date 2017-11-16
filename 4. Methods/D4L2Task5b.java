/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
This Program is for Day 4 Lab 2
*/

public class D4L2Task5b
{
	public static void main(String[] args)
	{
		int factorial = 0;
		int sigma = 0;
		
		for(int i = 1; i <= 30; i++)
		{
			factorial = getFactorial(i);
			sigma = getSigma(i);
			System.out.println("When the number is "+i+": Sigma = "+sigma+", Factorial = "+factorial);
		}
		
		
		
	}
	public static int getFactorial(int value)
	{
		int i = 1;
		int result = 1;
		while(i <= value)
		{
			result *= i;
			i++;
		}
		
		return result;
	}
	public static int getSigma(int value)
	{
		int i = 1;
		int result = 0;
		while(i <= value)
		{
			result += i;
			i++;
		}
		return result;
	}
}