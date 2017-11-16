/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
This Program is for Day 7 Lab 1
*/
import java.util.Scanner;

public class D7L1Task6
{
	public static void main(String[] args)
	{
		boolean isEven;
		
		int count = 1;
		while(count <= 100)
		{
			isEven = checkEven(count);
			if(isEven)
				System.out.println(count +" is an even number");
			else
				System.out.println(count +" is an odd number");
			count++;
		}
	}
	public static boolean checkEven(int n)
	{
		return (n%2 == 0);
	}
}