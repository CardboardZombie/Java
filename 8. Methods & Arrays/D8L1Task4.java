/*
Author: Tadhg Deeney
Course: Data Analytics
Number: 17186226
Date: 	6/9/2017

Description:
This Program is for Day 8 Lab 1
Write a program containing a boolean variable initialized to 'true'. In the main method of the
program, use an 'if' conditional to check the value of that boolean and to print "Hello" when it
is true or "Goodbye" when it is false.
(i.e.; Change the boolean's value from true to false and recompile the program)

*/
import java.util.Scanner;
public class D8L1Task4
{
	public static void main(String[] args)
	{
		boolean flag = false;
		if(flag)
			System.out.println("Hello");
		else
			System.out.println("Goodbye");
	}
}