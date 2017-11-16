/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Write a program that uses a for loop nested inside another
for loop. Each loop should maintain its own count variable
and print the value of that variable.
The outer loop should iterate 15 times
the inner loop shoul iterate 6 times backwards

Output:

I : 1
J : 6, 5, 4, 3, 2, 1,
I : 2
J : 6, 5, 4, 3, 2, 1,
I : 3
J : 6, 5, 4, 3, 2, 1,
I : 4
J : 6, 5, 4, 3, 2, 1,
I : 5
J : 6, 5, 4, 3, 2, 1,
I : 6
J : 6, 5, 4, 3, 2, 1,
I : 7
J : 6, 5, 4, 3, 2, 1,
I : 8
J : 6, 5, 4, 3, 2, 1,
I : 9
J : 6, 5, 4, 3, 2, 1,
I : 10
J : 6, 5, 4, 3, 2, 1,
I : 11
J : 6, 5, 4, 3, 2, 1,
I : 12
J : 6, 5, 4, 3, 2, 1,
I : 13
J : 6, 5, 4, 3, 2, 1,
I : 14
J : 6, 5, 4, 3, 2, 1,
I : 15
J : 6, 5, 4, 3, 2, 1,

*/

public class D8L2Task5
{
	public static void main(String[] args)
	{
		for(int i = 1; i<=15; i++)
		{
			System.out.println("I : "+i);
			System.out.print("J : ");
			for(int j = 6; j > 0; j--)
			{
				System.out.print(j+", ");
			}
			System.out.println();
		}
	}
}