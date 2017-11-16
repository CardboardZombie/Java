/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	30/8/2017

Description:
This Program is for Day 3 Lab 1
*/

public class D3L1Task1
{
	public static void main(String[] args)
	{
		int dayOfWeek = 3;
		System.out.println(); //To buffer the commandline
		if(dayOfWeek <= 7 && dayOfWeek >= 1)
		{
			if(dayOfWeek == 1)
				System.out.println("It's Monday!");
			else if(dayOfWeek == 2)
				System.out.println("It's Tuesday!");
			else if(dayOfWeek == 3)
				System.out.println("It's Wednesday!");
			else if(dayOfWeek == 4)
				System.out.println("It's Thursday!");
			else if(dayOfWeek == 5)
				System.out.println("It's Friday!");
			else if(dayOfWeek == 6)
				System.out.println("It's Saturday!");
			else
				System.out.println("It's Sunday!");
		}
		else
			System.out.println("Invalid Input");
	}
}