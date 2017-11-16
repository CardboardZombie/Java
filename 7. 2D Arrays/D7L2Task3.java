/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
Q1 from 2A && 2B (ie Do both Q1s)
+
Any 3 Questions from 2A | 2B

Day 7 Lab 2A - Question 2

Write a method called addThreeNumbers which takes 
three int parameters and returns an int value.

The method body should add the three numbers together 
and return the result of this addition.

Test this method in your main method by 
making a call to the method with actual parameter 5,8,9.

Tip: What is the method signature for this method? 

*/

public class D7L2Task3
{	
	public static void main(String[] args)
	{
		int n = addThreeNumbers(5,8,9);
		System.out.println(n);
	}
	public static int addThreeNumbers(int a, int b, int c)
	{
		int r = a+b+c;
		return r;
		
	}
}