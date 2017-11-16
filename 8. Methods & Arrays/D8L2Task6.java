/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Write a program containing a while loop that counts 20
times backwards and for each iteration of the loop, the
program must print whether the current value of the 
loop-counter variable is even or odd

Output:

20: Even
19: Odd
18: Even
17: Odd

*/

public class D8L2Task6
{
	public static void main(String[] args)
	{
		int c = 20;
		while(c > 0)
		{
			if(c%2==0)
				System.out.println(c+": Even");
			else
				System.out.println(c+": Odd");
			c--;
		}
	}
}