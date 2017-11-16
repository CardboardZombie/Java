/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	5/9/2017

Description:
Q1 from 2A && 2B (ie Do both Q1s)
+
Any 3 Questions from 2A | 2B

Day 7 Lab 2A - Question 4

Write a method named printManyTimes which takes an int and a String parameter and prints the
string a number of times determined by the value of the int. 
This method does not return any value.

Test this method in your main method passing it the parameters, 7 for the number of times to print and
the String, "Warning, learned compressed Java is bad for your health".

The method signature is:
  public static void printManyTimes (String phrase, int numTimes)

 Check: Try to see what happens if you call this method and give it a number followed by a String.


*/

public class D7L2Task5
{	
	public static void main(String[] args)
	{
		int s = nMinusOneProduct(5);
		System.out.println(s);
	}
	public static int nMinusOneProduct(int n)
	{
		int r = n * (n-1);
		return r;
	}
}