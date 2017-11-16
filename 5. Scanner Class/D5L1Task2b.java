/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	1/9/2017

Description:
This Program is for Day 5 Lab 1
*/

public class D5L1Task2b
{
	public static void main(String[] args)
	{
		int c = 0;
		System.out.println("Before entering the loop the value of the counter is "+c);
		while(c < 4)
		{
			c++;
			if(c == 3)
				System.out.println("Three is the magic number");
			else
				System.out.println("The value of the counter is -> "+c);		
		}
		System.out.println("Just after leaving the loop because it has finished.");
	}
}