/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Description:
This Program is for Day 8 Lab 1
Write a program that uses a for loop nested inside another
for loop. Each loop should maintain its own 
counting variable and print the value of that variable.
The outer loop should iterate 10 times.
The inner loop should iterate 7 times
*/
public class D8L1Task5i
{
	public static void main(String[] args)
	{

		for(int i = 0; i<10; i++)
		{
			System.out.println("I : "+i);
			for(int j = 0; j < 7; j++)
			{
				System.out.println("J : "+j);
			}
		}
	}
}