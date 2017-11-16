/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	31/8/2017

Description:
This Program is for Day 4 Lab 2
*/
import java.util.Scanner;

public class D4L2Task4
{
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter max factorial:");
		int maxFactorial = kb.nextInt();
		for(int i = 1; i <= maxFactorial; i++)
		{
			getFactorial(i);
		}
	}
	public static void getFactorial(int value)
	{
		int i = 1;
		long factorial = 1;
		while(i <= value)
		{
			factorial *= i;
			i++;
		}
		System.out.println(factorial);
	}
}