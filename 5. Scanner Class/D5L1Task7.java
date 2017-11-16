/*
Author: Tadhg Deeney
Course: Data Analytics
Student Number: Unknown
Date: 	1/9/2017

Description:
This Program is for Day 5 Lab 1
*/

import java.util.Scanner;
import java.lang.Math.*;

public class D5L1Task7
{
	public static void main(String[] args)
	{
		int input = 0;
		int total = 0;
		int counter = 0;
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		while(input >= 0)
		{
			input = sc.nextInt();
			if(input >= 0)
			{
				total += input;
				counter++;
			}
		} 
		avg = (int)Math.round(total/counter);
		System.out.println("The average of these numbers is "+avg);
	}
}