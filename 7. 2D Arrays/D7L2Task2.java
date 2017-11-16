/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
Q1 from 2A && 2B (ie Do both Q1s)
+
Any 3 Questions from 2A | 2B

Day 7 Lab 2B - Question 1
Write a method called calculateAverage 
that accepts two double parameters and 
returns one double value. 

Your method should return the average of the 
two input values.

Tip: Write down the signature for this method first

*/

public class D7L2Task2
{
	public static void main(String[] args)
	{
		System.out.print("N1: "+12);
		System.out.println("\tN2: "+9);
		System.out.println("*******AVERAGE********");
		double avg = calculateAverage(12.0, 9.0);
		System.out.println(avg);
		
	}
	public static double calculateAverage(double a, double b)
	{
		double r = (a+b)/2;
		return r;
	}
}