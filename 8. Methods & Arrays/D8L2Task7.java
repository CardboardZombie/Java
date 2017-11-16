/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Objective:
Week 2 Day 3: Lab 2

Task:
Write a program that generates 1000 random numbers between
0 and 100 using a loop (iterating 1000 times) and for
each iteration of the loop, prints whether the number
generated is greater than or less than 50

Output:

6: Less than 50
89: Greater than 50
50: This is 50!!!!

*/
import java.util.Random;
public class D8L2Task7
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int n = 0;
		for(int i = 1; i <= 1000; i++)
		{
			n = r.nextInt(101);
			
			if(n < 50)
				System.out.println(n+": Less than 50");
			else if(n > 50)
				System.out.println(n+": Greater than 50");
			else
				System.out.println(n+": This is 50!!!!");
		}
	}
}